package com.example.randomchoicehelperapplicationapp.services;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.randomchoicehelperapplicationapp.book.Book;

import java.util.List;
@Dao
public interface BookDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Book... books);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Book book);



    @Update
    void updateBooks(Book... books);

    @Delete
    void delete(Book book);

    @Query("SELECT * FROM book")
    LiveData<List<Book>> getAll();

    @Query("DELETE FROM book")
    void deleteAll();


}
