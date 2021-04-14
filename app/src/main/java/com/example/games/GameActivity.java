package com.example.games;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        String activity = intent.getStringExtra("game_key");

        if (activity.equals("1")) {
            LinearLayout viewResults = (LinearLayout) findViewById(R.id.game_1);
            viewResults.setVisibility(View.VISIBLE);
        } else if (activity.equals("2")) {
            LinearLayout viewResults = (LinearLayout) findViewById(R.id.game_2);
            viewResults.setVisibility(View.VISIBLE);
        } else if (activity.equals("3")) {
            LinearLayout viewResults = (LinearLayout) findViewById(R.id.game_3);
            viewResults.setVisibility(View.VISIBLE);
        } else if (activity.equals("4")) {
            LinearLayout viewResults = (LinearLayout) findViewById(R.id.game_4);
            viewResults.setVisibility(View.VISIBLE);
        } else if (activity.equals("5")) {
            LinearLayout viewResults = (LinearLayout) findViewById(R.id.game_5);
            viewResults.setVisibility(View.VISIBLE);
        } else if (activity.equals("6")) {
            LinearLayout viewResults = (LinearLayout) findViewById(R.id.game_6);
            viewResults.setVisibility(View.VISIBLE);
        }
    }
}