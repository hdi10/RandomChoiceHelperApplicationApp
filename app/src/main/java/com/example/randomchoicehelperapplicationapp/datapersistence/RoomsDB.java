package com.example.randomchoicehelperapplicationapp.datapersistence;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;


import com.example.randomchoicehelperapplicationapp.model.wordgroup.WordGroup;
import com.example.randomchoicehelperapplicationapp.model.wordgroup.WordGroupDao;

import java.util.concurrent.Executor;

import java.util.concurrent.Executors;

@Database (entities = {WordGroup.class}, version = 2, exportSchema = false)
public abstract class RoomsDB extends RoomDatabase {
    private static final int NUMBER_OF_THREADS = 8;
    public static Executor databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public abstract WordGroupDao wordGroupDao();
    //public abstract BookDao bookDao();

    private static volatile RoomsDB INSTANCE;


    public static RoomsDB getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (RoomsDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            RoomsDB.class, "room_database")
                            //.addCallback(sRoomDatabaseCallback)
                            .addMigrations(new Migration(1, 2) {
                                @Override
                                public void migrate(@NonNull SupportSQLiteDatabase database) {
                                    // SQL statements to perform the migration
                                }
                            })
                            .build();
                }
            }
        }


        return INSTANCE;



    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            // If you want to keep data through app restarts,
            // comment out the following block
            databaseWriteExecutor.execute(() -> {
                // Populate the database in the background.
                // If you want to start with more words, just add them.
                WordGroupDao dao = INSTANCE.wordGroupDao();
                dao.deleteAll();

                WordGroup book = new WordGroup("thisString1");
                dao.insert(book);
                book = new WordGroup("thisString2");
                dao.insert(book);
            });
        }
    };}


