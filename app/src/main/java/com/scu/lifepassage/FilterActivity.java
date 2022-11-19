package com.scu.lifepassage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class FilterActivity extends AppCompatActivity implements View.OnClickListener {


    int image_index = 0;
    private static final int MAX_IMAGE_COUNT = 6;

    private int[] mImageIds = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        Button btnPrevious = (Button)findViewById(R.id.previous_btn);
        btnPrevious.setOnClickListener(this);
        Button btnNext = (Button)findViewById(R.id.next_btn);
        btnNext.setOnClickListener(this);

        showImage();

    }

    private void showImage() {

        ImageView imgView = (ImageView) findViewById(R.id.myimage);
        imgView.setImageResource(mImageIds[image_index]);

    }

    public void onClick(View v) {

        switch (v.getId()) {

            case (R.id.previous_btn):

                image_index--;

                if (image_index == -1) {
                    image_index = MAX_IMAGE_COUNT - 1;
                }

                showImage();

                break;

            case (R.id.next_btn):

                image_index++;

                if (image_index == MAX_IMAGE_COUNT) {
                    image_index = 0;
                }

                showImage();

                break;

        }

    }
}

