package com.example.randomchoicehelperapplicationapp.model.wordgroup;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "wordgroup_table")
public class WordGroup {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "wordgroup")
    private String mWordGroup;

    public WordGroup(@NonNull String wordGroup) {this.mWordGroup = wordGroup;}

    public String getWordGroup(){return this.mWordGroup;}

    @NonNull
    public String getmWordGroup() {
        return mWordGroup;
    }

    public void setmWordGroup(@NonNull String mWordGroup) {
        this.mWordGroup = mWordGroup;
    }
}
