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
            put("gravity", "module1.pdf");
//            put("light", "module1.pdf");
//            put("circuits", "module1.pdf");
            put("worksheet1", "module4.pdf");
            put("waterInBody", "module2.pdf");
//            put("importanceOfWater", "module1.pdf");
//            put("digestion", "module1.pdf");
//            put("habits", "module1.pdf");
//            put("science", "module1.pdf");
            put("contamination", "module3.pdf");
//            put("wash", "module1.pdf");
//            put("experiments", "module1.pdf");
        }};
    }

    @Override
    public void onClick(View v) {
        Intent pdfViewIntent = new Intent(LearnActivity.this, PdfView.class);
        int id = v.getId();
        boolean flag = true;

        if (id == R.id.gravity) {
            pdfViewIntent.putExtra("filename", this.data.get("gravity"));
//        } else if (id == R.id.light) {
//            pdfViewIntent.putExtra("filename", this.data.get("light"));
//        } else if (id == R.id.circuits) {
//            pdfViewIntent.putExtra("filename", this.data.get("circuits"));
        } else if (id == R.id.worksheet1) {
            pdfViewIntent.putExtra("filename", this.data.get("worksheet1"));
        } else if (id == R.id.waterInBody) {
            pdfViewIntent.putExtra("filename", this.data.get("waterInBody"));
//        } else if (id == R.id.importanceOfWater) {
//            pdfViewIntent.putExtra("filename", this.data.get("importanceOfWater"));
//        } else if (id == R.id.digestion) {
//            pdfViewIntent.putExtra("filename", this.data.get("digestion"));
//        } else if (id == R.id.habits) {
//            pdfViewIntent.putExtra("filename", this.data.get("habits"));
//        } else if (id == R.id.science) {
//            pdfViewIntent.putExtra("filename", this.data.get("science"));
        } else if (id == R.id.contamination) {
            pdfViewIntent.putExtra("filename", this.data.get("contamination"));
//        } else if (id == R.id.wash) {
//            pdfViewIntent.putExtra("filename", this.data.get("wash"));
//        } else if (id == R.id.experiments) {
//            pdfViewIntent.putExtra("filename", this.data.get("experiments"));
        } else {
          flag = false;
        }

        if(flag) {
            LearnActivity.this.startActivity(pdfViewIntent);
        }
    }
}