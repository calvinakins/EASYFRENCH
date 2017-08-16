package com.example.robihno.easyfrench;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ROBIHNO on 8/10/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    // Resource ID for the background color for this list of words
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView frenchTextView = (TextView) listItemView.findViewById(R.id.french_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        frenchTextView.setText(currentWord.getFrenchTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
       // imageView.setImageResource(currentWord.getImageResourceId());

        if (currentWord.hasImage()){
            //set the ImageView to the image resource specified in the current Word.
            imageView.setImageResource(currentWord.getImageResourceId());
           //Make sure that this view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            //OTHERWISE hide the Image View (set visibilility to gone
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color taht the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //set the background color of the text container View
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}