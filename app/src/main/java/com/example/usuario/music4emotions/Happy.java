package com.example.usuario.music4emotions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.action;
import static android.R.attr.fragment;
import static android.os.Build.VERSION_CODES.M;

public class Happy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);

        // Find the View that shows the icon to go to the artist profile
        ImageView plus_one = (ImageView) findViewById(R.id.h_plus_one);

        // Set a click listener on that View
        plus_one.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the happy ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent plus_oneIntent = new Intent(Happy.this, happy_artist_one.class);
                startActivity(plus_oneIntent);
            }
        });

        // Find the View that shows the icon to go to the artist profile
        ImageView plus_two = (ImageView) findViewById(R.id.h_plus_two);

        // Set a click listener on that View
        plus_two.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the happy ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent plus_twoIntent = new Intent(Happy.this, happy_artist_two.class);
                startActivity(plus_twoIntent);
            }
        });

        // Find the View that shows the icon to go to the artist profile
        ImageView plus_three = (ImageView) findViewById(R.id.h_plus_three);

        // Set a click listener on that View
        plus_three.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the happy ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent plus_threeIntent = new Intent(Happy.this, happy_artist_three.class);
                startActivity(plus_threeIntent);
            }
        });

        // Find the View that shows the icon to go to the artist profile
        ImageView plus_four = (ImageView) findViewById(R.id.h_plus_four);

        // Set a click listener on that View
        plus_four.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the happy ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent plus_fourIntent = new Intent(Happy.this, happy_artist_four.class);
                startActivity(plus_fourIntent);
            }
        });

        // Find the View that shows the icon to go to the playing now activity
        ImageView CreamCover = (ImageView) findViewById(R.id.thb_h_two_);

        // Set a click listener on that View
        CreamCover.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Cream Cover ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent goToPlayingNowIntent = new Intent(Happy.this, Playingnow.class);
                startActivity(goToPlayingNowIntent);
            }
        });

        // Find the View that shows the text to go to the Music Store screen
        TextView MusicStore = (TextView) findViewById(R.id.music_store);

        // Set a click listener on that View
        MusicStore.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the text Music Store is clicked on.
            @Override
            public void onClick(View view) {
                Intent goToStoreIntent = new Intent(Happy.this, Store.class);
                startActivity(goToStoreIntent);
            }
        });

        // Find the View that shows the text to go to the Main screen
        TextView MainMenu = (TextView) findViewById(R.id.menu_main_happy_screen);

        // Set a click listener on that View
        MainMenu.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the text Main is clicked on.
            @Override
            public void onClick(View view) {
                Intent goToMainIntent = new Intent(Happy.this, MainActivity.class);
                startActivity(goToMainIntent);
            }
        });
    }

    public void GoToSearch (View view) {
        TextView search = (TextView) findViewById(R.id.search);
        Toast.makeText(this, "This action would open a fragment with a searching field", Toast.LENGTH_SHORT).show();;

    }

    public void like1 (View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView heart1 = (ImageView) findViewById(R.id.h_heart_one);
        heart1.setImageResource(R.drawable.green_heart);

    }

    public void like2 (View view) {
        ImageView heart2 = (ImageView) findViewById(R.id.h_heart_two);
        heart2.setImageResource(R.drawable.green_heart);

    }

    public void like3 (View view) {

        ImageView heart3 = (ImageView) findViewById(R.id.h_heart_three);
        heart3.setImageResource(R.drawable.green_heart);

    }

    public void like4 (View view) {
        ImageView heart4 = (ImageView) findViewById(R.id.h_heart_four);
        heart4.setImageResource(R.drawable.green_heart);

    }

}