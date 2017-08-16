package com.example.robihno.easyfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

       // creating an arraylist which is more flexible than arrays
        // and use only Object data not primitive

        ArrayList<Word> words = new ArrayList<Word>();

        Word w = new Word("one","un", R.drawable.number_one);
        words.add(w);
        //or
        words.add(new Word("two","deux", R.drawable.number_two2));
        words.add(new Word("three","trois" , R.drawable.number_three1));
        words.add(new Word("four","quatre" , R.drawable.number_four1));
        words.add(new Word("five","cinq" , R.drawable.number_five1));
        words.add(new Word("six","six" , R.drawable.number_six1));
        words.add(new Word("seven","sept" , R.drawable.number_seven));
        words.add(new Word("eight","huit" , R.drawable.number_eight1));
        words.add(new Word("nine","neuf" , R.drawable.number_nine1));
        words.add(new Word("ten", "dix" , R.drawable.number_ten1));
        words.add(new Word("Eleven","Onze" , R.drawable.number_ten));
        words.add(new Word("twelve","Douze" , R.drawable.number_one));
        words.add(new Word("thirteen","Treize" , R.drawable.number_one));
        words.add(new Word("fourteen","Quatorze" , R.drawable.number_one));
        words.add(new Word("fixteen","quinze" , R.drawable.number_one));
        words.add(new Word("Sixteen","Seize" , R.drawable.number_one));
        words.add(new Word("Seventeen","dix-sept" , R.drawable.number_one));
        words.add(new Word("Eighteen","dix-huit" , R.drawable.number_one));
        words.add(new Word("Nineteen","dix-neuf" , R.drawable.number_one));
        words.add(new Word("Twenty","Vingt" , R.drawable.number_one));
        words.add(new Word("twenty-one","Vingt-et-un" , R.drawable.number_one));
        words.add(new Word("twenty-two","Vingt-deux" , R.drawable.number_one));
        words.add(new Word("twenty-three","Vingt-trois" , R.drawable.number_one));
        words.add(new Word("twenty-four","Vingt-qautre" , R.drawable.number_one));
        words.add(new Word("twenty-five","Vingt-cinq" , R.drawable.number_one));
        words.add(new Word("twenty-six","Vingt-six" , R.drawable.number_one));
        words.add(new Word("twenty-seven","Vingt-sept" , R.drawable.number_one));
        words.add(new Word("twenty-eight","Vingt-huit" , R.drawable.number_one));
        words.add(new Word("twenty-nine","Vingt-neuf" , R.drawable.number_one));
        words.add(new Word("Thirthy","Trente" , R.drawable.number_one));
        words.add(new Word("Thirty-one","Trente-et-un" , R.drawable.number_one));
        words.add(new Word("Thirthy-two","Trente-deux" , R.drawable.number_one));
        words.add(new Word("Thirthy-three","Trente-trois" , R.drawable.number_one));
        words.add(new Word("Thirthy-four","Trente-quatre" , R.drawable.number_one));
        words.add(new Word("Thirthy-five","Trente-cinq" , R.drawable.number_one));
        words.add(new Word("Thirthy-six","Trente-six" , R.drawable.number_one));
        words.add(new Word("Thirthy-seven","Trente-sept" , R.drawable.number_one));
        words.add(new Word("Thirthy-eight","Trente-huit" , R.drawable.number_one));
        words.add(new Word("Thirthy-nine","Trente-neuf" , R.drawable.number_one));
        words.add(new Word("Forthy","Quarante" , R.drawable.number_one));
        words.add(new Word("Forthy-one","quarante-et-un" , R.drawable.number_one));
        words.add(new Word("Forthy-two","quarante-deux" , R.drawable.number_one));
        words.add(new Word("Forthy-three","quarante-trois" , R.drawable.number_one));
        words.add(new Word("Forthy-four","quarante-quatre" , R.drawable.number_one));
        words.add(new Word("Forthy-five","quarante-cinq" , R.drawable.number_one));
        words.add(new Word("Forthy-six","quarante-six" , R.drawable.number_one));
        words.add(new Word("Forthy-seven","quarante-sept" , R.drawable.number_one));
        words.add(new Word("Forthy-eight","quarante-huit" , R.drawable.number_one));
        words.add(new Word("Forthy-nine","quarante-nuef", R.drawable.number_one));
        words.add(new Word("Fifty","Cinquante" , R.drawable.number_fifty));






        // ArrayList<String> words = new ArrayList<String>();
       // words.add("one");
       // words.add("two");
        //words.add("three");
        WordAdapter numadapter =
                 new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(numadapter);



        //LinearLayout rootView = (LinearLayout)findViewById(R.id.rootview);
        //using a for loop
       // for (int index=0; index<words.size(); index++){
        //    TextView wordView = new TextView(this);
        //    wordView.setText(words.get(index));
        //    rootView.addView(wordView);
        //}

        // creat and initialize a counter to keep track of the while loop, and prevent forever loops
        //using while loop
        //int index =0;
        //while(index<words.size()){
        // TextView wordView = new TextView(this);
        //wordView.setText(words.get(index));
        // rootView.addView(wordView);
        //index++;
        //}

// the while loop above substitutes all this code . whis
        // wwhich is short and faster than typing this code for each word you want to print
        //TextView wordView = new TextView(this);
       // wordView.setText(words.get(index));
        //rootView.addView(wordView);
        //index++;

       // TextView wordView2 = new TextView(this);
        //wordView2.setText(words.get(index));
        //rootView.addView(wordView2);
        //index++;

              //Creating an array of words
       // String[] words = new String[10];
       // words[0]="one";
       // words[1]="two";
        //words[2]="three";
       // words[3]="four";
       // words[4]="five";
       // words[5]="six";
       // words[6]="seven";
      //  words[7]="eight";
       // words[8]="nine";
      //  words[9]="ten";

        // verify the content of the arrays created
        // log.i("tag", "Message to be logged" + index reference);
       // Log.v("NumbersActivity","Word at index 0:" + words.get(0));
      //  Log.v("NumbersActivity","Word at index 0:" + words.get(1));
        //  Log.v("NumbersActivity","Word at index 0:" + words[2]);
    }
}
