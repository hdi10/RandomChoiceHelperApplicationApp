package com.example.randomchoicehelperapplicationapp.model.wordgroup;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.randomchoicehelperapplicationapp.datapersistence.RoomsDB;

import java.util.List;
import com.example.randomchoicehelperapplicationapp.datapersistence.RoomsDB;

public class WordGroupRepository {

    private WordGroupDao mWordGroupDao;
    private LiveData<List<WordGroup>> mAllWordGroups;

    public WordGroupRepository(Application application) {
        RoomsDB db = RoomsDB.getDatabase(application);
        mWordGroupDao = db.wordGroupDao();
        mAllWordGroups = mWordGroupDao.getAlphabetizedWords();
    }

    public LiveData<List<WordGroup>> getAllWordGroups() {
        return mAllWordGroups;
    }


    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    public void insert(WordGroup word) {
        RoomsDB.databaseWriteExecutor.execute(() -> {
            mWordGroupDao.insert(word);
        });
    }

}
