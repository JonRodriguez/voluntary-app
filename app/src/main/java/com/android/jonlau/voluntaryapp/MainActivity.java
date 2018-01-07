package com.android.jonlau.voluntaryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent profileIntent = new Intent(this, ProfileActivity.class);
        final Intent chatIntent = new Intent(this, ChatActivity.class);
        final Intent newsIntent = new Intent(this, NewsActivity.class);
        final Intent gamesIntent = new Intent(this, GamesActivity.class);

        final Button profileButton = findViewById(R.id.profile_button_id);
        profileButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(profileIntent);
            }
        });
        final Button chatButton = findViewById(R.id.chat_button_id);
        chatButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(chatIntent);
            }
        });
        final Button newsButton = findViewById(R.id.news_button_id);
        newsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(newsIntent);
            }
        });
        final Button gamesButton = findViewById(R.id.games_button_id);
        gamesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(gamesIntent);
            }
        });
    }

    public void openProfileActivity(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
