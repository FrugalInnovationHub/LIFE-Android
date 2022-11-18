package com.scu.lifepassage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        final Button button = findViewById(R.id.gravity);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent myIntent = new Intent(LearnActivity.this, PdfView.class);
//                myIntent.putExtra("key", value); //Optional parameters
                LearnActivity.this.startActivity(myIntent);
            }
        });
    }
}