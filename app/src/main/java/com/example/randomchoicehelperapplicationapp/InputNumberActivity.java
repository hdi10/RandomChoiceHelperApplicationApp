package com.example.randomchoicehelperapplicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoice;
import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoiceGenerator;

public class InputNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_number);

        int[] numbers = new int[4];

        EditText field1 = (EditText) findViewById(R.id.editNumber);
        EditText field2 = (EditText) findViewById(R.id.editNumber2);
        EditText field3 = (EditText) findViewById(R.id.editNumber3);
        EditText field4 = (EditText) findViewById(R.id.editNumber4);
        Button buttonGo = (Button) findViewById(R.id.goRandomNumber);
        TextView textView = (TextView) findViewById(R.id.resultNumber);



    }

    public void OnClickGoChooseRandomNumber(View view){
        RandomChoiceGenerator machine = new RandomChoice();
        TextView textView = (TextView) findViewById(R.id.resultNumber);
        EditText field1 = (EditText) findViewById(R.id.editNumber);
        EditText field2 = (EditText) findViewById(R.id.editNumber2);
        EditText field3 = (EditText) findViewById(R.id.editNumber3);
        EditText field4 = (EditText) findViewById(R.id.editNumber4);
        int[] intArr = new int[4];

        intArr[0] = Integer.parseInt(field1.getText().toString());
        intArr[1] = Integer.parseInt(field2.getText().toString());
        intArr[2] = Integer.parseInt(field3.getText().toString());
        intArr[3] = Integer.parseInt(field4.getText().toString());

        int randomInt = machine.chooseRandomNumber2(intArr);
        field4.setShowSoftInputOnFocus(false);  //hinzugefügt softkeyboard handling
        textView.setText(String.valueOf(randomInt));
    }
}