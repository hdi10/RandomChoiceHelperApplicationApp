package com.example.randomchoicehelperapplicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoice;
import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoiceGenerator;

public class InputMoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_movies);

        EditText field1 = (EditText) findViewById(R.id.editText);
        EditText field2 = (EditText) findViewById(R.id.editText2);
        EditText field3 = (EditText) findViewById(R.id.editText3);
        EditText field4 = (EditText) findViewById(R.id.editText4);
        Button buttonGo = (Button) findViewById(R.id.goRandomString);
        TextView textView = (TextView) findViewById(R.id.resultString);

        field1.getText();
        field2.getText();
        field3.getText();
        field4.getText();
    }

    public void OnClickGoChooseRandomString(View view){
        RandomChoiceGenerator machine = new RandomChoice();
        TextView textView = (TextView) findViewById(R.id.resultString);
        EditText field1 = (EditText) findViewById(R.id.editText);
        EditText field2 = (EditText) findViewById(R.id.editText2);
        EditText field3 = (EditText) findViewById(R.id.editText3);
        EditText field4 = (EditText) findViewById(R.id.editText4);
        String[] stringArray = new String[4];

        stringArray[0] = field1.getText().toString();
        stringArray[1] = field2.getText().toString();
        stringArray[2] = field3.getText().toString();
        stringArray[3] = field4.getText().toString();

        String randomString = machine.chooseRandomlyString2(stringArray);
        field4.setShowSoftInputOnFocus(false);  //hinzugefügt softkeyboard handling
        textView.setText(randomString);

    }
}