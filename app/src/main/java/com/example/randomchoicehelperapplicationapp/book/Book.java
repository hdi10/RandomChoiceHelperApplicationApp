package com.example.randomchoicehelperapplicationapp.book;
import androidx.room.ColumnInfo;

import androidx.room.Entity;

import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.time.LocalDate;

@Entity(indices = {@Index(value = {"buch_titel", "name"},
        unique = true)})
public class Book {

    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "buch_titel")
    public String buchtitel;

    @ColumnInfo(name = "name")
    public String autorenname;

    @ColumnInfo(name ="zusammenfassung")
    public String resueme;

    @ColumnInfo(name = "band")
    public String bandnr;

    //Todo spater zu LocalDate
    @ColumnInfo(name ="publikations_datum")
    public String date;

    @ColumnInfo(name = "verlag")
    public String herausgeber;

    @ColumnInfo(name ="seitenzahl")
    public long seitenzahl;

    @ColumnInfo(name ="isbn")
    public String isbn;

    @Ignore
    @ColumnInfo(name="anmerkung_id")
    public Anmerkung comment;

    public String getBook(){return this.buchtitel;}

}
