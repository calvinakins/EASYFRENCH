package com.example.robihno.easyfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);



        // creating an arraylist which is more flexible than arrays
        // and use only Object data not primitive
        ArrayList<Word> colors = new ArrayList<Word>();

        colors.add(new Word("green","Vert" , R.drawable.color_green));
        colors.add(new Word("red","Rouge", R.drawable.color_red));
        colors.add(new Word("yellow","Jaune" , R.drawable.color_mustard_yellow));
        colors.add(new Word("blue","Bleu", R.drawable.color_blue));
        colors.add(new Word("Gold","Gold",  R.drawable.color_gold));
        colors.add(new Word("White","Blanc",  R.drawable.color_white));
        colors.add(new Word("Black","Noir",  R.drawable.color_black));
        colors.add(new Word("Orange","Orange",  R.drawable.color_orange));
        colors.add(new Word("Purple","Violet",  R.drawable.color_purple));
        colors.add(new Word("Pink","Rose",  R.drawable.color_rose));
        colors.add(new Word("Brown","Marron",  R.drawable.color_brown));
        colors.add(new Word("Grey","Gris" ,  R.drawable.color_gray));
        colors.add(new Word("Rose","Rose" , R.drawable.color_rose));
        colors.add(new Word("Indigo","Indigo",  R.drawable.color_indigo));

        WordAdapter coladapter =
                new WordAdapter(this, colors,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.color_list);

        listView.setAdapter(coladapter);

      ////  ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colors);

      //  ListView listView = (ListView) findViewById(R.id.list1);

       // listView.setAdapter(itemsAdapter);

    }
}
