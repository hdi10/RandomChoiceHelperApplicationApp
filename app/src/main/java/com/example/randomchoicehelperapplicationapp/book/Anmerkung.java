package com.example.randomchoicehelperapplicationapp.book;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Anmerkung {

    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "titel")
    public String titel;

    @ColumnInfo(name = "name")
    public String autorenName;

    @ColumnInfo(name ="ist_gelesen")
    public Boolean istGelesen;

    @ColumnInfo(name = "band")
    public long bandNr;

    @ColumnInfo(name="kommentar_inhalt")
    public String content;



}
