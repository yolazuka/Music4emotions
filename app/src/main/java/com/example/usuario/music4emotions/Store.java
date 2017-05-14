package com.example.usuario.music4emotions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        // Find the View that shows the icon to go to the main activity
        TextView Main = (TextView) findViewById(R.id.menu_main);

        // Set a click listener on that View
        Main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Main text is clicked on.
            @Override
            public void onClick(View view) {
                Intent GoToMainIntent = new Intent(Store.this, MainActivity.class);
                startActivity(GoToMainIntent);
            }
        });

        // Find the View that shows the icon to go to the artist profile activity
        TextView ArtistProfile = (TextView) findViewById(R.id.menu_artist_profile);

        // Set a click listener on that View
        ArtistProfile.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artist Profile text is clicked on.
            @Override
            public void onClick(View view) {
                Intent GoToProfileIntent = new Intent(Store.this, happy_artist_two.class);
                startActivity(GoToProfileIntent);
            }
        });

        // Find the View that shows the icon to go to the playlist activity
        TextView Playlist = (TextView) findViewById(R.id.menu_playlist);

        // Set a click listener on that View
        Playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist text is clicked on.
            @Override
            public void onClick(View view) {
                Intent GoToPlaylistIntent = new Intent(Store.this, Happy.class);
                startActivity(GoToPlaylistIntent);
            }
        });

    }
    // This toast explains the action planned when the text "Buy it now" is clicked on
    public void GoToPayment(View view) {
        TextView Payment = (TextView) findViewById(R.id.payment_button);
        Toast.makeText(this, "We are redirecting you to the main payments site", Toast.LENGTH_SHORT).show();
    }
}