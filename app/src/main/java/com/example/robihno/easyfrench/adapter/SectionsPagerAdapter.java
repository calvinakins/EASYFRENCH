package com.example.robihno.easyfrench.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.robihno.easyfrench.fragments.ConversationPhrasesFragment;
import com.example.robihno.easyfrench.fragments.GeneralPhrasesFragment;
import com.example.robihno.easyfrench.fragments.GreetingsPhrasesFragment;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return GeneralPhrasesFragment.newInstance();
            case 1:
                return GreetingsPhrasesFragment.newInstance();
            case 2:
                return ConversationPhrasesFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "General";
            case 1:
                return "Greetings";
            case 2:
                return "Conversations";
        }
        return null;
    }
}