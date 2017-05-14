package com.example.usuario.music4emotions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Playingnow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playingnow);

        // Find the View that shows the text to go to the main activity
        TextView MenuMain = (TextView) findViewById(R.id.menu_main);

        // Set a click listener on that View
        MenuMain.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the text Main is clicked on.
            @Override
            public void onClick(View view) {
                Intent goToMainIntent = new Intent(Playingnow.this, MainActivity.class);
                startActivity(goToMainIntent);
            }
        });

        // Find the View that shows the text to go to the Artist Profile activity
        TextView MenuProfile = (TextView) findViewById(R.id.menu_artist_profile);

        // Set a click listener on that View
        MenuProfile.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the text Artist Profile  is clicked on.
            @Override
            public void onClick(View view) {
                Intent goToProfileIntent = new Intent(Playingnow.this, happy_artist_two.class);
                startActivity(goToProfileIntent);
            }
        });

        // Find the View that shows the text to go to the playlist activity
        TextView MenuPlaylist = (TextView) findViewById(R.id.menu_playlist);

        // Set a click listener on that View
        MenuPlaylist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the text Artist Profile  is clicked on.
            @Override
            public void onClick(View view) {
                Intent goToPlaylistIntent = new Intent(Playingnow.this, Happy.class);
                startActivity(goToPlaylistIntent);
            }
        });
    }

    // Toast that explains the action planned when the stop button is clicked on.
    public void StopTheMusic(View view) {
        ImageView Stop = (ImageView) findViewById(R.id.stop);
        Toast.makeText(this, "This action would stop the player, the music would stop", Toast.LENGTH_SHORT).show();
    }

}