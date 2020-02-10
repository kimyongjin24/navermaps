package com.kimyong.navermaps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.overlay.Marker;

public class Ulsan2Activity extends AppCompatActivity implements OnMapReadyCallback {
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulsan2);

        mapView = findViewById(R.id.ulsan2);
        mapView.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull NaverMap naverMap) {

        Marker marker = new Marker();
        marker.setPosition((new LatLng(35.532483, 129.307530)));
        marker.setMap(naverMap);
        marker.setCaptionText("공업로타리(동학서림 앞)(07:05)");

        Marker marker1 = new Marker();
        marker1.setPosition((new LatLng(35.549346, 129.308114)));
        marker1.setMap(naverMap);
        marker1.setCaptionText("태화로타리(태화병원 맞은편)(07:10)");

        Marker marker2 = new Marker();
        marker2.setPosition((new LatLng(35.550239, 129.263384)));
        marker2.setMap(naverMap);
        marker2.setCaptionText("신복R 만남광장 편의점(언양분기점,울산IC방향)(07:23)");

    }
}
