package com.example.usuario.music4emotions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class happy_artist_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy_artist_two);

        // Find the View that shows the text to go to the MAIN screen
        TextView GoToMain = (TextView) findViewById(R.id.menu_main_artist_profile);

        // Set a click listener on that View
        GoToMain.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the text Music Store is clicked on.
            @Override
            public void onClick(View view) {
                Intent goToMainIntent = new Intent(happy_artist_two.this, MainActivity.class);
                startActivity(goToMainIntent);
            }
        });

        // Find the View that shows the text to go to the Music Store screen
        TextView MusicStore = (TextView) findViewById(R.id.music_store);

        // Set a click listener on that View
        MusicStore.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the text Music Store is clicked on.
            @Override
            public void onClick(View view) {
                Intent goToStoreIntent = new Intent(happy_artist_two.this, Store.class);
                startActivity(goToStoreIntent);
            }
        });
    }

    public void GoToSearch(View view) {
        TextView search = (TextView) findViewById(R.id.search);
        Toast.makeText(this, "This action would open a fragment with a searching field", Toast.LENGTH_SHORT).show();
        ;

    }
}
