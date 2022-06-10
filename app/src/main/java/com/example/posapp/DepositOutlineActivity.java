package com.example.posapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DepositOutlineActivity extends AppCompatActivity {
    private RecyclerView DepositRecViewOutline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit_outline);

        DepositRecViewOutline=findViewById(R.id.DepositRecViewOutline);

        //TODO: Fill up this activity.
    }
}