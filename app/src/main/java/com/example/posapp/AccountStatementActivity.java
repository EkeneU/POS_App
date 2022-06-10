package com.example.posapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AccountStatementActivity extends AppCompatActivity {
    private RecyclerView TableRecView;
    private TableRecViewAdapter adapter;


    //Narrartion = Name + transaction reference + description.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_statement);

        TableRecView=findViewById(R.id.TableRecView);
        TableRecView.setHasFixedSize(true);
        adapter=new TableRecViewAdapter(this);
        adapter.setAccountStatementOutline(Database.getInstance().getAccountStatementOutline());
        TableRecView.setAdapter(adapter);
        TableRecView.setLayoutManager(new LinearLayoutManager(this));
    }
}