package com.example.randomchoicehelperapplicationapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.randomchoicehelperapplicationapp.datapersistence.RoomsDB;
import com.example.randomchoicehelperapplicationapp.model.wordgroup.WordGroup;
import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoice;
import com.example.randomchoicehelperapplicationapp.randomclass.RandomChoiceGenerator;

public class MainActivity extends AppCompatActivity {

    private RoomsDB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WordGroup dao = null;

        Button generateRandoNumber = (Button) findViewById(R.id.buttonGenerateRandomNumber);
        Button chooseRandomMovie = (Button) findViewById(R.id.buttonChooseRandomWord);
        Button chooseRandoNumber = (Button) findViewById(R.id.buttonChooseRandomNumber);
        Button generateRandomString = (Button) findViewById(R.id.buttonGenerateRandomString);

        TextView textViewInit1 = (TextView) findViewById(R.id.outputRandomNumber);
        textViewInit1.setText(R.string.outputRandom);
        TextView textViewInit2 = (TextView) findViewById(R.id.outputRandomString);
        textViewInit2.setText(R.string.outputRandomString);



        WordGroup wordGroup = new WordGroup("something1");

        wordGroup.getmWordGroup();

        /*book.uid = 1;
        book.buchtitel = "The Catcher in the Rye";
        book.autorenname = "J.D. Salinger";
        book.resueme = "The story of a teenage boy named Holden Caulfield";
        book.bandnr = "1";
        book.date = "1951-07-16";
        book.herausgeber = "Little, Brown and Company";
        book.seitenzahl = 224;
        book.isbn = "9780316769488";

        Anmerkung anmerkung = new Anmerkung();
        anmerkung.uid = 1;
        anmerkung.titel = "Notes on The Catcher in the Rye";
        anmerkung.autorenName = "John Doe";
        anmerkung.istGelesen = false;
        anmerkung.bandNr = 1;
        anmerkung.content = "I really enjoyed reading this book.";

        book.comment = anmerkung;


        try {
            RoomsDB db = RoomsDB.getDatabase(this);
            bookDao.insert(book);
        }catch (Exception e){
            Log.d("error", e.getLocalizedMessage());
        }

        //bookDao.getAll();

        //Log.i("buecherliste",bookDao.getAll().toString());
*/
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