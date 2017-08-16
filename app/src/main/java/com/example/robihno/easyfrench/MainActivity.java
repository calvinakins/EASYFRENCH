package com.example.robihno.easyfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find the view that shows the number activity
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //set a clicklistener on that view
        numbers.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Learn numbers", Toast.LENGTH_SHORT).show();
                //create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                //start the new activity
                startActivity(numbersIntent);
            }
        });

        //find the view that shows the idioms activity
        TextView idioms = (TextView) findViewById(R.id.idioms);

        //set a clicklistener on that view
        idioms.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "idioms", Toast.LENGTH_SHORT).show();
                //create a new intent to open the {@link FamilyActivity}
                Intent idiomsIntent = new Intent(MainActivity.this, IdiomsActivity.class);
                //start the new activity
                startActivity(idiomsIntent);
            }
        });
        //find the view that shows the color activity
        TextView colors = (TextView) findViewById(R.id.colors);

        //set a clicklistener on that view
        colors.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Identify colors", Toast.LENGTH_SHORT).show();
                //create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                //start the new activity
                startActivity(colorsIntent);
            }
        });
        //find the view that shows the phrases activity
        TextView phrases = (TextView) findViewById(R.id.phrases);

        //set a clicklistener on that view
        phrases.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "learn phrases", Toast.LENGTH_SHORT).show();
                //create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                //start the new activity
                startActivity(phrasesIntent);
            }
        });
    }
    public void openConjugationsList (View view){
        Toast.makeText(MainActivity.this, "Conjugations", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, ConjugationsActivity.class);
        startActivity(i);
    }
}
