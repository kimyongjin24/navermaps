package com.kimyong.navermaps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.overlay.Marker;

public class Changwon1Activity extends AppCompatActivity implements OnMapReadyCallback {
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changwon1);

        mapView = findViewById(R.id.changwon1);
        mapView.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull NaverMap naverMap) {

        Marker marker = new Marker();
        marker.setPosition((new LatLng(35.236747,128.639310)));
        marker.setMap(naverMap);
        marker.setCaptionText("창원종합버스터미널앞(07:00)");
        marker.setIconPerspectiveEnabled(true);

        Marker marker1 = new Marker();
        marker1.setPosition((new LatLng(35.240674,128.653389)));
        marker1.setMap(naverMap);
        marker1.setCaptionText("창원 시티세븐 CGV앞(07:05)");
        marker1.setIconPerspectiveEnabled(true);

        Marker marker2 = new Marker();
        marker2.setPosition((new LatLng(35.236031,128.667824)));
        marker2.setMap(naverMap);
        marker2.setCaptionText("창원종합운동장 만남의광장(07:10)");
        marker2.setIconPerspectiveEnabled(true);

        Marker marker3 = new Marker();
        marker3.setPosition((new LatLng(35.227938,128.679326)));
        marker3.setMap(naverMap);
        marker3.setCaptionText("창원시청로타리 한서병원(07:13)");
        marker3.setIconPerspectiveEnabled(true);

        Marker marker4 = new Marker();
        marker4.setPosition((new LatLng(35.202032,128.697727)));
        marker4.setMap(naverMap);
        marker4.setCaptionText("남산시외버스정류장(부산방향)(07:26)");
        marker4.setIconPerspectiveEnabled(true);

    }
}
