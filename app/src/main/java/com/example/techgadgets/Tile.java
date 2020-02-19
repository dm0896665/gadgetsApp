package com.example.techgadgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tile);

        final Button learn = findViewById(R.id.MoreTile);
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/Tile-Essentials-Pack-Stickers-Mate/dp/B07W86T94T?ref_=ast_slp_dp")));
            }
        });
    }
}
