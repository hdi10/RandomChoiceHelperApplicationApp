package com.example.randomchoicehelperapplicationapp;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;

import static com.example.randomchoicehelperapplicationapp.DatabaseActivity.NEW_WORD_ACTIVITY_REQUEST_CODE;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.NewWordGroupActivity;
import com.example.randomchoicehelperapplicationapp.book.Book;
import com.example.randomchoicehelperapplicationapp.datapersistence.RoomsDB;
import com.example.randomchoicehelperapplicationapp.services.BookDao;
import com.example.randomchoicehelperapplicationapp.viewmodel.BookListAdapter;
import com.example.randomchoicehelperapplicationapp.viewmodel.BookViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    private BookDao bookDao;
    public static final String EXTRA_REPLY = "com.example.android.wordlistsql.REPLY";

    private EditText mEditWordView;
    private BookViewModel mBookiewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //bookDao = RoomsDB.getDatabase();

        mBookiewModel = new ViewModelProvider(this).get(BookViewModel.class);







    }

    /*public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == NEW_WORD_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {
            Book book = new Book(data.getStringExtra(NewWordGroupActivity.EXTRA_REPLY));
            mBookiewModel.insert(book);
        } else {
            Toast.makeText(
                    getContext().getApplicationContext(),
                    R.string.empty_not_saved,
                    Toast.LENGTH_LONG).show();
        }
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View returnView = inflater.inflate(R.layout.fragment_1, container, false);
        // Inflate the layout for this fragment

        //bookDao =
        RecyclerView recyclerView = returnView.findViewById(R.id.recyclerview);
        final BookListAdapter adapter = new BookListAdapter(new BookListAdapter.BookDiff());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        final Button button = returnView.findViewById(R.id.button_save);

        button.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if (TextUtils.isEmpty(mEditWordView.getText())) {
                setResult(RESULT_CANCELED, replyIntent);
            } else {
                String word = mEditWordView.getText().toString();
                replyIntent.putExtra(EXTRA_REPLY, word);
                setResult(RESULT_OK, replyIntent);
            }
            finish();
        });

        FloatingActionButton fab = returnView.findViewById(R.id.fab);
        fab.setOnClickListener( view -> {
            Intent intent = new Intent(getContext().getApplicationContext(), NewWordGroupActivity.class);
            startActivityForResult(intent, NEW_WORD_ACTIVITY_REQUEST_CODE);
        });

        return returnView;



    }

    private void finish() {
    }

    private void setResult(int resultCanceled, Intent replyIntent) {
    }
}