package com.scu.lifepassage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.io.File;

import es.voghdev.pdfviewpager.library.PDFViewPager;
import es.voghdev.pdfviewpager.library.adapter.PDFPagerAdapter;
import es.voghdev.pdfviewpager.library.asset.CopyAsset;
import es.voghdev.pdfviewpager.library.asset.CopyAssetThreadImpl;

public class PdfView extends AppCompatActivity {
    PDFViewPager pdfViewPager = findViewById(R.id.pdfViewPager);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        Intent intent = getIntent();
        CopyAsset copyAsset = new CopyAssetThreadImpl(this, new Handler());
        String asset = null;
        copyAsset.copy(asset, new File(getCacheDir(), "module1.pdf").getAbsolutePath());
        System.out.println("************************");
        System.out.println(asset);
        pdfViewPager = new PDFViewPager(this, asset);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        ((PDFPagerAdapter) pdfViewPager.getAdapter()).close();
    }
}