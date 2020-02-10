package com.kimyong.navermaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Sub2Activity extends AppCompatActivity {

    private Button button21;
    private Button button22;
    private Button button23;
    private Button button24;
    private Button button25;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);adView.setAdUnitId("ca-app-pub-9519759211663298/2543906048");

        button25 = findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent25 = new Intent(Sub2Activity.this, KimhaeActivity.class);
                startActivity(intent25);
            }
        });

        button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent24 = new Intent(Sub2Activity.this, Ulsan2Activity.class);
                startActivity(intent24);
            }
        });

        button23 = findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent23 = new Intent(Sub2Activity.this, Ulsanbang1Activity.class);
                startActivity(intent23);
            }
        });

        button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22 = new Intent(Sub2Activity.this, Changwon2Activity.class);
                startActivity(intent22);
            }
        });

        button21 = findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent21 = new Intent(Sub2Activity.this, Changwon1Activity.class);
                startActivity(intent21);
            }
        });
    }
}
