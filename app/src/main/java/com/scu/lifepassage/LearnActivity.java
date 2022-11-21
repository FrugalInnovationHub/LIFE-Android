package com.scu.lifepassage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

public class LearnActivity extends AppCompatActivity implements View.OnClickListener {

    Map<String, String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        data = new HashMap<String, String>() {{
            put("introduction", "introduction.pdf");
            put("module1", "module1.pdf");
            put("module2", "module2.pdf");
            put("module3", "module3.pdf");
            put("module4", "module4.pdf");
        }};
    }

    @Override
    public void onClick(View v) {
        Intent pdfViewIntent = new Intent(LearnActivity.this, PdfView.class);
        int id = v.getId();
        boolean flag = true;

        if (id == R.id.introduction) {
            pdfViewIntent.putExtra("filename", this.data.get("introduction"));
        } else if (id == R.id.module1) {
            pdfViewIntent.putExtra("filename", this.data.get("module1"));
        } else if (id == R.id.module2) {
            pdfViewIntent.putExtra("filename", this.data.get("module2"));
        } else if (id == R.id.module3) {
            pdfViewIntent.putExtra("filename", this.data.get("module3"));
        } else if (id == R.id.module4) {
            pdfViewIntent.putExtra("filename", this.data.get("module4"));
        } else {
          flag = false;
        }

        if(flag) {
            LearnActivity.this.startActivity(pdfViewIntent);
        }
    }
}