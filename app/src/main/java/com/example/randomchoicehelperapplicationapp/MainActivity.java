package com.example.randomchoicehelperapplicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoice;
import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoiceGenerator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button generateRandoNumber = (Button) findViewById(R.id.buttonGenerateRandomNumber);
        Button chooseRandomMovie = (Button) findViewById(R.id.buttonChooseRandomWord);
        Button chooseRandoNumber = (Button) findViewById(R.id.buttonChooseRandomNumber);
        Button generateRandomString = (Button) findViewById(R.id.buttonGenerateRandomString);

        TextView textViewInit1 = (TextView) findViewById(R.id.outputRandomNumber);
        textViewInit1.setText(R.string.outputRandom);
        TextView textViewInit2 = (TextView) findViewById(R.id.outputRandomString);
        textViewInit2.setText(R.string.outputRandomString);

        

    }






    public void OnClickGenerateRandomInteger(View view) {
        RandomChoiceGenerator machine = new RandomChoice();
        TextView textView = (TextView) findViewById(R.id.outputRandomNumber);
        int randomInt = machine.generateRandomInteger();
        String string = Integer.toString(randomInt);
        textView.setText(string);

    }

    public void OnClickGenerateRandomString(View view) {
        RandomChoiceGenerator machine = new RandomChoice();
        TextView textView = (TextView) findViewById(R.id.outputRandomString);
        String string = machine.generateRandomString();
        textView.setText(string);
    }

    public void OnClickChooseRandomNumber(View view) {
        Intent i = new Intent(this, InputNumberActivity.class);
        startActivity(i);
    }

    public void OnClickChooseRandomString(View view) {
        Intent i = new Intent(this, InputMoviesActivity.class);
        startActivity(i);
    }


    public void OnClickStartActivityDB(View view) {
        Intent i = new Intent(this, FindTheBestChoice.class);
        startActivity(i);
    }
}