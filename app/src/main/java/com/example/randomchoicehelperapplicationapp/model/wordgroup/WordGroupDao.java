package com.example.randomchoicehelperapplicationapp.model.wordgroup;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;
@Dao
public interface WordGroupDao {

    @Query("SELECT * FROM wordgroup_table ORDER BY wordgroup ASC")
    LiveData<List<WordGroup>> getAlphabetizedWords();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(WordGroup word);

    @Query("DELETE FROM wordgroup_table")
    void deleteAll();

}
