package com.kimyong.navermaps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.overlay.Marker;

public class Subway2Activity extends AppCompatActivity implements OnMapReadyCallback {
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subway2);

        mapView = findViewById(R.id.subway2);
        mapView.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull NaverMap naverMap) {

        Marker marker = new Marker();
        marker.setPosition((new LatLng(35.1358619,129.1007891)));
        marker.setMap(naverMap);
        marker.setCaptionText("경성대부경대역 부경대방향 200m지점 휴대폰할인마트앞");

    }
}
