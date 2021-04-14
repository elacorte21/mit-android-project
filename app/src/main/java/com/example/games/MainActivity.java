package com.example.games;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation slideUp, slideLeft;
    CardView cView1, cView2, cView3;
    TextView heading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        slideLeft = AnimationUtils.loadAnimation(this, R.anim.slide_left);
        heading = findViewById(R.id.heading);
        heading.setAnimation(slideLeft);
        cView1 = findViewById(R.id.link_cat_1);
        cView2 = findViewById(R.id.link_cat_2);
        cView3 = findViewById(R.id.link_cat_3);
        cView1.setAnimation(slideUp);
        cView2.setAnimation(slideUp);
        cView3.setAnimation(slideUp);
    }

    public void viewCats(View v) {

        Intent catIntent = new Intent(this, CategoryActivity.class);

        if (v.getId() == R.id.link_cat_1) {
            catIntent.putExtra("cat_key","cat1");
            //Toast.makeText(this, "this is first", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.link_cat_2) {
            catIntent.putExtra("cat_key","cat2");
        } else if (v.getId() == R.id.link_cat_3) {
            catIntent.putExtra("cat_key","cat3");
        }

        startActivity(catIntent);

    }

}