package com.example.randomchoicehelperapplicationapp.services;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.randomchoicehelperapplicationapp.book.Book;
import com.example.randomchoicehelperapplicationapp.datapersistence.RoomsDB;

import java.util.List;

public class BookRepository {

    private BookDao mBookDao;
    private LiveData<List<Book>> mAllBooks;

    public BookRepository(Application application) {
        RoomsDB db = RoomsDB.getDatabase(application);
        mBookDao = db.bookDao();
        mAllBooks = mBookDao.getAll();
    }

    public LiveData<List<Book>> getAllBooks() {
        return mAllBooks;
    }


    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    public void insert(Book book) {
        RoomsDB.databaseWriteExecutor.execute(() -> {
            mBookDao.insert(book);
        });
    }


}
