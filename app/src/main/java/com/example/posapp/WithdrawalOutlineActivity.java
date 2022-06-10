package com.example.posapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class WithdrawalOutlineActivity extends AppCompatActivity {

    private RecyclerView WithdrawalOutlineRecView;
    private WithdrawalRecViewAdapter adapter;
    //private ArrayList<TransactionWithdrawalOutline> transactionWithdrawalOutlines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdrawal_outline);

        WithdrawalOutlineRecView=findViewById(R.id.WithdrawalOutlineRecView);
        adapter=new WithdrawalRecViewAdapter(this);
        adapter.setTransactionWithdrawalOutline(Database.getInstance().getTransactionWithdrawalOutline());
        WithdrawalOutlineRecView.setAdapter(adapter);
        WithdrawalOutlineRecView.setLayoutManager(new LinearLayoutManager(this));

        //transactionWithdrawalOutlines =new ArrayList<>();
        //transactionWithdrawalOutlines.add(new TransactionWithdrawalOutline("x", "a", "b", "c", "d" ));
        //adapter.setTransactionWithdrawalOutlines(transactionWithdrawalOutlines);


    }
}