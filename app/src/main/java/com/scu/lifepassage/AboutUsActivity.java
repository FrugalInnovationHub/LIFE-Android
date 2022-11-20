package com.scu.lifepassage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        final ImageButton fih_button = findViewById(R.id.fih);
        final ImageButton scu_button = findViewById(R.id.scu);
        final ImageButton passage_button = findViewById(R.id.passage);
        final ImageButton students_button = findViewById(R.id.students);

        fih_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(AboutUsActivity.this, FihActivity.class);
                AboutUsActivity.this.startActivity(myIntent);
            }
        });

        scu_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(AboutUsActivity.this, ScuActivity.class);
                AboutUsActivity.this.startActivity(myIntent);
            }
        });

        passage_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(AboutUsActivity.this, PassageActivity.class);
                AboutUsActivity.this.startActivity(myIntent);
            }
        });

        students_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(AboutUsActivity.this, AboutStudentsActivity.class);
                AboutUsActivity.this.startActivity(myIntent);
            }
        });
    }
}