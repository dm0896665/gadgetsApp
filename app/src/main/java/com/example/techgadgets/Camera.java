package com.example.techgadgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Camera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        final Button learn = findViewById(R.id.MoreCamera);
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/Panasonic-Camera-Professional-Microphone-Bundle/dp/B0722KLW6L/ref=pd_sbs_421_4?_encoding=UTF8&psc=1&refRID=AXPVASE8KKGATXC5FWCQ")));
            }
        });
    }
}
