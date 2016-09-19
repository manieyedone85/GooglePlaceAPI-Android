package app.googleplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class GoogleMapActivity extends AppCompatActivity implements OnMapReadyCallback {
    String title, address;
    double latitude,longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_map);

        Intent intent = getIntent();
        latitude = intent.getDoubleExtra("latitude", 0d);
        longitude = intent.getDoubleExtra("longitute",0d);
        title = intent.getStringExtra("name");
        address = intent.getStringExtra("address");


        //Log.e("place",latlngss);

        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.map_menu, menu);
        menu.findItem(R.id.item_ok).setVisible(true);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.item_ok:
                Intent intent=new Intent(GoogleMapActivity.this,MainActivity.class);
                intent.putExtra("address",address);
                startActivity(intent);
                // newGame();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void onMapReady(GoogleMap map){
        LatLng sydney = new LatLng(latitude,longitude);


        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));
        map.addMarker( new MarkerOptions()
                .title(title)
                .snippet(address)
                .position(sydney));
    }

}