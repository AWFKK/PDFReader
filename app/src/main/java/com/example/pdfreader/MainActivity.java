package com.example.pdfreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Button btn_Open;

    //Simple PDF File
    //From Internal Storage
    //You can set your pdf file path here
    Uri path = Uri.fromFile(new File("/sdcard/Camera Scanner/letters/company 20200617_112113 09.pdf"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Open = findViewById(R.id.btn_open);

        btn_Open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_VIEW);
                sendIntent.setDataAndType(path,"application/pdf");
                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });


    }
}