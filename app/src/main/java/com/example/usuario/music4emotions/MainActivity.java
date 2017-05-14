package com.example.usuario.music4emotions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the happyplaylist category
        ImageView happy = (ImageView) findViewById(R.id.happy);

        // Set a click listener on that View
        happy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the happy ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent happyIntent = new Intent(MainActivity.this, Happy.class);
                startActivity(happyIntent);
            }
        });

        // Find the View that shows the hungoverplaylist category
        ImageView hungover = (ImageView) findViewById(R.id.hungover);

        // Set a click listener on that View
        hungover.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hungover ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent hungoverIntent = new Intent(MainActivity.this, Hungover.class);
                startActivity(hungoverIntent);
            }
        });

        // Find the View that shows the relaxedplaylist category
        ImageView relaxed = (ImageView) findViewById(R.id.relaxed);

        // Set a click listener on that View
        relaxed.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the relaxed ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent relaxedIntent = new Intent(MainActivity.this, Relaxed.class);
                startActivity(relaxedIntent);
            }
        });

        // Find the View that shows the energeticplaylist category
        ImageView energetic = (ImageView) findViewById(R.id.energetic);

        // Set a click listener on that View
        energetic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the energetic ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent energeticIntent = new Intent(MainActivity.this, Energetic.class);
                startActivity(energeticIntent);
            }
        });

        // Find the View that shows the sadplaylist category
        ImageView sad = (ImageView) findViewById(R.id.sad);

        // Set a click listener on that View
        sad.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sad ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent sadIntent = new Intent(MainActivity.this, Sad.class);
                startActivity(sadIntent);
            }
        });

        // Find the View that shows the sadplaylist category
        ImageView concentrate = (ImageView) findViewById(R.id.concentrate);

        // Set a click listener on that View
        concentrate.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sad ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent concentrateIntent = new Intent(MainActivity.this, Concentrate.class);
                startActivity(concentrateIntent);
            }
        });

        // Find the View that shows the text to go to the music store activity
        TextView MusicStore = (TextView) findViewById(R.id.music_store);

        // Set a click listener on that View
        MusicStore.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sad ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent GoToStoreIntent = new Intent(MainActivity.this, Store.class);
                startActivity(GoToStoreIntent);
            }
        });

        // Find the View that shows the Concentrated/focused category
        ImageView concentrated = (ImageView) findViewById(R.id.concentrate);

        // Set a click listener on that View
        concentrated.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sad ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent concentrateIntent = new Intent(MainActivity.this, Concentrate.class);
                startActivity(concentrateIntent);
            }
        });
    }

    public void GoToSearch(View view) {
        TextView Search = (TextView) findViewById(R.id.search);
        Toast.makeText(this, "This action would open a fragment with a searching field", Toast.LENGTH_SHORT).show();
    }
}