package com.example.posapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt_signText;
    private ImageView ImgAppLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_signText=findViewById(R.id.txt_signText);
        ImgAppLogo=findViewById(R.id.ImgAppLogoLogin);

      

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, VerificationActivity.class);
                startActivity(intent);
                MainActivity.this.finish();

            }
        }, 3000);

    }
}