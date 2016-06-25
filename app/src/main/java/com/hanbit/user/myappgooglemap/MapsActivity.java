package com.hanbit.user.myappgooglemap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity  {

    static final LatLng SEOUL = new LatLng(37, 56,126.97);
    private GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        map = ((SupportMapFragment)getSupprotFragmentManager().findFragmentById(R.id.map)).getMap();
        Marker seoul = map.addMarker(new MarkerOptions().position(SEOUL).title("seoul"));

        map.moveCamera(CameraUpdateFactory.newLngZone(SEOUL, 15));
        map.animatieCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

    }


}
