package com.example.randomchoicehelperapplicationapp;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        /*// Get the BookDatabase instance
        bookDatabase = Room.databaseBuilder(getActivity().getApplicationContext(),
                RoomsDB.class, "room_database").build();

        // Get the BookDao instance
        bookDao = bookDatabase.bookDao();

        // Create a new book entry
        Book newBook = new Book();
        newBook.buchtitel = "The Catcher in the Rye";
        newBook.autorenname = "J.D. Salinger";
        newBook.resueme = "The novel's protagonist Holden Caulfield has become an icon for teenage rebellion.";
        newBook.bandnr = "1";
        newBook.date = "1951";
        newBook.herausgeber = "Little, Brown and Company";
        newBook.seitenzahl = 277;
        newBook.isbn = "9780316769174";

        bookDao.insert(newBook);*/


        return view;
    }

}