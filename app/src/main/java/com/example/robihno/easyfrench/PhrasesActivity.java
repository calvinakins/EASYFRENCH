package com.example.robihno.easyfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


    // creating an arraylist which is more flexible than arrays
    // and use only Object data not primitive
    ArrayList<Word> phrases = new ArrayList<Word>();
                 phrases.add(new Word("Do you speak English?", "Parlez-vous anglais? "));
        phrases.add(new Word("Yes, I speak English", "Oui, je parle anglais."));
        phrases.add(new Word("But I don’t speak French very well.", "Mais, je ne parle pas bien français. "));
        phrases.add(new Word("Could you speak slower?", "Pouvez-vous parler plus lentement?"));
        phrases.add(new Word("Yes", "Oui"));
        phrases.add(new Word("Can you translate for me?", "Pouvez-vous traduire pour moi"));
        phrases.add(new Word("How do you say ~ in French?", "Comment dit-on ~ en français? "));
        phrases.add(new Word("Goodday", "bonjour"));
        phrases.add(new Word("Good evening", "Bonsoir"));
        phrases.add(new Word("Good evening Ladies and Gentlemen", "Bonsoir mesdames et messieurs"));
        phrases.add(new Word("Hi Everybody", "Salut tout le monde(informal)"));
        phrases.add(new Word("Goodevening", "Bonsoir"));
        phrases.add(new Word("Goodbye", "Au revoir"));
        phrases.add(new Word("Goodbye and see you tomorrow", "Au revoir et a demain"));
        phrases.add(new Word("Goodnight", "Bonne nuit"));
        phrases.add(new Word("See you soon", "A bientot"));
        phrases.add(new Word("What is your name(formal)", "Comment vous appelez-vous? "));
        phrases.add(new Word("What is your name(informal)", "Comment t’appelles-tu? "));
        phrases.add(new Word("Im Calvin", "Je suis Calvin "));
        phrases.add(new Word("My name is Calvin", "Je m'appelle Calvin "));
        phrases.add(new Word("Please (formal)", "S'il vous plait "));
        phrases.add(new Word("Thank you", "Merci "));
        phrases.add(new Word("Thank you very much", "Merci beaucoup "));
        phrases.add(new Word("Please (informal)", "S'il te plait "));
        phrases.add(new Word("I thank you", "Je vous remercie "));
        phrases.add(new Word("What time is it please?", "Quelle heure est-il, s'il vous plait?"));
        phrases.add(new Word("Please, where is the telephone?", "S'il te plait, où est le téléphone? "));
        phrases.add(new Word("Where are you from?", "D’où viens-tu/D’où venez-vous "));
        phrases.add(new Word("What is your profession?", "Qu’est-ce que vous faites?(formal)"));
        phrases.add(new Word("What do you do?", "Qu’est-ce que tu fais?(Informal "));
        phrases.add(new Word("Do you enjoy it?", "Ça te plaît? "));
        phrases.add(new Word("What do you do in your free time?", "Qu’est-ce que vous aimez faire pendant votre temps libre?  "));
        phrases.add(new Word("Do you have siblings?(Do you have brothers and siters?", " Est-ce que vous avez des frères et sœurs? "));
        phrases.add(new Word("I don’t understand", "Je ne comprends pas "));
        phrases.add(new Word("Today", "Aujourd'hui "));
        phrases.add(new Word("Yesterday", "Hier "));
        phrases.add(new Word("Tomorrow", "Demain "));
        phrases.add(new Word("The Week", "La Semaine "));
        phrases.add(new Word("There is", "Il est "));
        phrases.add(new Word("There are", "Il y a"));
        phrases.add(new Word("There are seven days in the week ", "Il y a sept jours dans la semaine "));


        WordAdapter phrasadapter =
                new WordAdapter(this, phrases,R.color.category_phrases);

                // Be careful that as you cast to a ListView, you also changed the activity to be a ListView too.
                ListView listView = (ListView) findViewById(R.id.phrase_list);

                listView.setAdapter(phrasadapter);
                }

                }
