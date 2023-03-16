package com.example.randomchoicehelperapplicationapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.randomchoicehelperapplicationapp.book.Book;
import com.example.randomchoicehelperapplicationapp.services.BookRepository;

import java.util.List;

public class BookViewModel extends AndroidViewModel {

    private BookRepository mBookRepostiory;

    private final LiveData<List<Book>> mAllBooks;

    public BookViewModel(@NonNull Application application) {
        super(application);
        mBookRepostiory = new BookRepository(application);
        mAllBooks = mBookRepostiory.getAllBooks();
    }

    LiveData<List<Book>> getAllBooks(){ return mAllBooks;};

    public void insert(Book book){ mBookRepostiory.insert(book);}

}
