package com.kimyong.navermaps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.overlay.Marker;

public class Changwon2Activity extends AppCompatActivity implements OnMapReadyCallback {
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changwon2);

        mapView = findViewById(R.id.changwon2);
        mapView.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull NaverMap naverMap) {

        Marker marker = new Marker();
        marker.setPosition((new LatLng(35.202580,128.696925)));
        marker.setMap(naverMap);
        marker.setCaptionText("남산동 시외버스정류장(07:10)");

        Marker marker1 = new Marker();
        marker1.setPosition((new LatLng(35.201378,128.815161)));
        marker1.setMap(naverMap);
        marker1.setCaptionText("장유동사무소맞은편(장유은혜요양병원 앞)(07:30)");


    }
}
