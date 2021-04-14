package com.example.games;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportActionBar().hide();

        Intent catIntent = getIntent();
        String activity = catIntent.getStringExtra("cat_key");
        //Toast.makeText(this, activity, Toast.LENGTH_SHORT).show();

        if (activity.equals("cat1")) {
            LinearLayout viewResults = (LinearLayout) findViewById(R.id.cat_1);
            viewResults.setVisibility(View.VISIBLE);
        } else if (activity.equals("cat2")) {
            LinearLayout viewResults = (LinearLayout) findViewById(R.id.cat_2);
            viewResults.setVisibility(View.VISIBLE);
        } else if (activity.equals("cat3")) {
            LinearLayout viewResults = (LinearLayout) findViewById(R.id.cat_3);
            viewResults.setVisibility(View.VISIBLE);
        }
    }

    public void viewGame(View v) {

        Intent intent = new Intent(this, GameActivity.class);

        if (v.getId() == R.id.link_game_1) {
            intent.putExtra("game_key","1");
            //Toast.makeText(this, "this is first", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.link_game_2) {
            intent.putExtra("game_key","2");
        } else if (v.getId() == R.id.link_game_3) {
            intent.putExtra("game_key","3");
        } else if (v.getId() == R.id.link_game_4) {
            intent.putExtra("game_key","4");
        } else if (v.getId() == R.id.link_game_5) {
            intent.putExtra("game_key","5");
        } else if (v.getId() == R.id.link_game_6) {
            intent.putExtra("game_key","6");
        }

        startActivity(intent);

    }
}