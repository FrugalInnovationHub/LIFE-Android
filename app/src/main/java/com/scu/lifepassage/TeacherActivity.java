package com.scu.lifepassage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        final Button button = findViewById(R.id.como_usar_el_filtro);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent myIntent = new Intent(TeacherActivity.this, VideoPlayerActivity.class);
                myIntent.putExtra("key", R.raw.como_usar_el_filtro); //Optional parameters
                TeacherActivity.this.startActivity(myIntent);
            }
        });

        final Button button2 = findViewById(R.id.mensaje_para_profes);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent myIntent = new Intent(TeacherActivity.this, VideoPlayerActivity.class);
                myIntent.putExtra("key", R.raw.mensaje_para_profes); //Optional parameters
                TeacherActivity.this.startActivity(myIntent);
            }
        });
        final Button button3 = findViewById(R.id.limpiar_tubos);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent myIntent = new Intent(TeacherActivity.this, VideoPlayerActivity.class);
                myIntent.putExtra("key", R.raw.limpiar_tubos); //Optional parameters
                TeacherActivity.this.startActivity(myIntent);
            }
        });
        final Button button4 = findViewById(R.id.remplazar_arena);

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent myIntent = new Intent(TeacherActivity.this, VideoPlayerActivity.class);
                myIntent.putExtra("key", R.raw.remplazar_arena); //Optional parameters
                TeacherActivity.this.startActivity(myIntent);
            }
        });
        final Button button5 = findViewById(R.id.remplazar_grava);

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent myIntent = new Intent(TeacherActivity.this, VideoPlayerActivity.class);
                myIntent.putExtra("key", R.raw.remplazar_grava_y_carbon_activo); //Optional parameters
                TeacherActivity.this.startActivity(myIntent);
            }
        });
        final Button button6 = findViewById(R.id.remplazar_malla);

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent myIntent = new Intent(TeacherActivity.this, VideoPlayerActivity.class);
                myIntent.putExtra("key", R.raw.remplazar_malla); //Optional parameters
                TeacherActivity.this.startActivity(myIntent);
            }
        });
        final Button button7 = findViewById(R.id.vacelina);

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent myIntent = new Intent(TeacherActivity.this, VideoPlayerActivity.class);
                myIntent.putExtra("key", R.raw.vacelina); //Optional parameters
                TeacherActivity.this.startActivity(myIntent);
            }
        });


    }
}