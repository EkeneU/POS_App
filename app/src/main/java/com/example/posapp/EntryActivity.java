package com.example.posapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EntryActivity extends AppCompatActivity {
    private CardView BalanceSheetCardView, DepositCardView, WithdrawalCardView;
    private TextView txt_balancesheet, txt_deposit, txt_withdrawal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        BalanceSheetCardView=findViewById(R.id.BalanceSheetCardview);
        DepositCardView=findViewById(R.id.DepositCardView);
        WithdrawalCardView=findViewById(R.id.WithdrawalCardView);

        txt_balancesheet=findViewById(R.id.txt_balancesheet);
        txt_deposit=findViewById(R.id.txt_deposit);
        txt_withdrawal=findViewById(R.id.txt_withdrawal);

        withdrawTab();
        depositTab();
        balancesheetTab();


    }

    private void withdrawTab() {
        WithdrawalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntryActivity.this, WithdrawalOutlineActivity.class);
                startActivity(intent);
            }
        });
    }
    private void depositTab(){
        DepositCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EntryActivity.this, DepositOutlineActivity.class);
                startActivity(intent);
            }
        });
    }
    private void balancesheetTab(){
        BalanceSheetCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EntryActivity.this, AccountStatementActivity.class);
                startActivity(intent);

            }
        });
    }
}