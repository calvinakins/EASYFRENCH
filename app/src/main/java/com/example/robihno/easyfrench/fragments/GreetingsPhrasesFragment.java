package com.example.robihno.easyfrench.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.robihno.easyfrench.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GreetingsPhrasesFragment extends Fragment {

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static GreetingsPhrasesFragment newInstance() {
        return new GreetingsPhrasesFragment();
    }

    public GreetingsPhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_greetings_phrases, container, false);
    }

}
