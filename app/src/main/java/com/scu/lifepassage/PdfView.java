package com.scu.lifepassage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.io.File;
import java.util.Objects;

import es.voghdev.pdfviewpager.library.PDFViewPager;
import es.voghdev.pdfviewpager.library.adapter.BasePDFPagerAdapter;
import es.voghdev.pdfviewpager.library.adapter.PDFPagerAdapter;
import es.voghdev.pdfviewpager.library.asset.CopyAsset;
import es.voghdev.pdfviewpager.library.asset.CopyAssetThreadImpl;

public class PdfView extends AppCompatActivity {
    PDFViewPager pdfViewPager;
    BasePDFPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);

        String asset = getIntent().getStringExtra("filename");
        pdfViewPager = findViewById(R.id.pdfViewPager);
        adapter = new PDFPagerAdapter(this, asset);

        pdfViewPager.setAdapter(adapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Objects.requireNonNull(adapter).close();
    }
}