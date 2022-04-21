package com.example.randomchoicehelperapplicationapp;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.NewWordGroupActivity;
import com.example.randomchoicehelperapplicationapp.model.wordgroup.WordGroup;
import com.example.randomchoicehelperapplicationapp.view.WordGroupListAdapter;
import com.example.randomchoicehelperapplicationapp.viewmodel.WordGroupViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DatabaseActivity extends AppCompatActivity {

    public static final int NEW_WORD_ACTIVITY_REQUEST_CODE = 1;
    private WordGroupViewModel mWordGroupViewModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);




        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final WordGroupListAdapter adapter = new WordGroupListAdapter(new WordGroupListAdapter.WordGroupDiff());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        mWordGroupViewModel = new ViewModelProvider(this).get(WordGroupViewModel.class);


        mWordGroupViewModel.getAllWordGroups().observe(this,wordgroups -> {
            adapter.submitList(wordgroups);
        });


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener( view -> {
            Intent intent = new Intent(DatabaseActivity.this, NewWordGroupActivity.class);
            myActivityResultLauncher.launch(intent);
        });

    }

    ActivityResultLauncher<Intent> myActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == NEW_WORD_ACTIVITY_REQUEST_CODE) {


                        Log.d("her","hier");
                    } else {
                        Toast.makeText(
                                getApplicationContext(),
                                R.string.empty_not_saved,
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
    );


    }

