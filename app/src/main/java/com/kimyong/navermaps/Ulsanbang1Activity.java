package com.kimyong.navermaps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.overlay.Marker;

public class Ulsanbang1Activity extends AppCompatActivity implements OnMapReadyCallback {
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulsanbang1);

        mapView = findViewById(R.id.ulsan1);
        mapView.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull NaverMap naverMap) {

        Marker marker = new Marker();
        marker.setPosition((new LatLng(35.487840, 129.420228)));
        marker.setMap(naverMap);
        marker.setCaptionText("방어진 꽃나루공원(07:20)");

        Marker marker1 = new Marker();
        marker1.setPosition((new LatLng(35.555929, 129.338829)));
        marker1.setMap(naverMap);
        marker1.setCaptionText("학성공원(07:40)");


        Marker marker2 = new Marker();
        marker2.setPosition((new LatLng(35.549128, 129.308092)));
        marker2.setMap(naverMap);
        marker2.setCaptionText("태화로타리(태화병원 맞은편)(08:10)");


        Marker marker3 = new Marker();
        marker3.setPosition((new LatLng(35.550239, 129.263384)));
        marker3.setMap(naverMap);
        marker3.setCaptionText("신복R 만남광장 편의점(언양분기점,울산IC방향)(08:23)");

    }
}
