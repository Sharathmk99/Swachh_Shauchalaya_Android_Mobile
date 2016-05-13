package com.hack.swachhshauchalaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class RatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        ((ImageView)findViewById(R.id.imageView1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RatingActivity.this,"Thank You...!",Toast.LENGTH_LONG).show();
                finish();
            }
        });
        ((ImageView)findViewById(R.id.imageView2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RatingActivity.this,"Thank You...!",Toast.LENGTH_LONG).show();
                finish();
            }
        });
        ((ImageView)findViewById(R.id.imageView3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RatingActivity.this,"Thank You...!",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
