package com.example.randomchoicehelperapplicationapp.datapersistence;

import android.content.Context;

import androidx.annotation.BoolRes;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.randomchoicehelperapplicationapp.book.Book;
import com.example.randomchoicehelperapplicationapp.model.wordgroup.WordGroup;
import com.example.randomchoicehelperapplicationapp.model.wordgroup.WordGroupDao;
import com.example.randomchoicehelperapplicationapp.services.BookDao;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database (entities = {Book.class,WordGroup.class}, version = 1, exportSchema = false)
public abstract class RoomsDB extends RoomDatabase {
    private static final int NUMBER_OF_THREADS = 8;
    public static Executor databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public abstract WordGroupDao wordGroupDao();
    public abstract BookDao bookDao();

    private static volatile RoomsDB INSTANCE;






    public static RoomsDB getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (RoomsDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            RoomsDB.class, "room_database")
                            .addCallback(sRoomDatabaseCallback)

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
                BookDao dao = INSTANCE.bookDao();
                dao.deleteAll();

                Book book = new Book();
                dao.insert(book);
                book = new Book();
                dao.insert(book);
            });
        }
    };}


