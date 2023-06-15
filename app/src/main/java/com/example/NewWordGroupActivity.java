package com.example;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import com.example.randomchoicehelperapplicationapp.R;
import com.example.randomchoicehelperapplicationapp.datapersistence.RoomsDB;
import com.example.randomchoicehelperapplicationapp.model.wordgroup.WordGroup;
import com.example.randomchoicehelperapplicationapp.model.wordgroup.WordGroupDao;

public class NewWordGroupActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.wordlistsql.REPLY";

    private EditText mEditWordView;

    private WordGroupDao dao;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word_group);
        mEditWordView = findViewById(R.id.edit_word);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if (TextUtils.isEmpty(mEditWordView.getText())) {
                setResult(RESULT_CANCELED, replyIntent);
            } else {
                String bookTitle = mEditWordView.getText().toString();
                WordGroup wordGroup = new WordGroup("testgroup");
                wordGroup.getmWordGroup();


                try {
                    RoomsDB db = RoomsDB.getDatabase(this);
                    dao.insert(wordGroup);
                }catch (Exception e){
                    Log.d("error", e.getLocalizedMessage());
                }

                replyIntent.putExtra(EXTRA_REPLY, bookTitle);
                setResult(RESULT_OK, replyIntent);
                Log.d("result", bookTitle);
            }
            finish();
        });

    }

}