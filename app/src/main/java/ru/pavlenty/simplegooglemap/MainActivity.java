package ru.pavlenty.simplegooglemap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions().position(new LatLng(2, 2)).title("Marker1"));
        map.addMarker(new MarkerOptions().position(new LatLng(30, 32)).title("Marker2"));
        map.addMarker(new MarkerOptions().position(new LatLng(14, 14)).title("Marker3"));
        map.addMarker(new MarkerOptions().position(new LatLng(75, 75)).title("Marker4"));
        map.addMarker(new MarkerOptions().position(new LatLng(26, 26)).title("Marker5"));
    }
}
