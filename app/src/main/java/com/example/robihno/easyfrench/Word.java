package com.example.robihno.easyfrench;

/**
 * Created by ROBIHNO on 8/9/2017.
 */
//state
public class Word {
    // defualt translation for the word
    private String mDefaultTranslation;
    // french translation for the word
    private String mFrenchTranslation;
    // Image resource id for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //constructor (note we have 2)
    //this is one is for phrases and conjugasions activity which take no image,
    // therefore needing just two input arguments which are strings
    public Word(String defaultTranslation, String frenchTranslation) {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
    }
    //constructor 2.
    // this is for the images and colors which take 3 input arguments including imageResourceId
    public Word(String defaultTranslation, String frenchTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
        mImageResourceId = imageResourceId;
    }
    //methods
    /**
     * Get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    /**
     * Get the French translation of the word
     */
    public String getFrenchTranslation() {
        return mFrenchTranslation;
    }
    //return the image resource id for word
    public int getImageResourceId(){
        return mImageResourceId;
    }
// Returns whether or not there is an image for this word.
    public boolean hasImage(){

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}


