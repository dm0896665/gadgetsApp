package com.example.techgadgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.techgadgets.R;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [] gadgets = {"Tile", "Breakaway Connector", "Earbuds", "Drone", "Camera"};


        //adapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.wish, gadgets);
        setListAdapter(adapter);
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch(position)
        {
            case 0:
                startActivity(new Intent(MainActivity.this, Tile.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, Connector.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Earbuds.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Drone.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, Camera.class));
                break;

        }
    }
}
