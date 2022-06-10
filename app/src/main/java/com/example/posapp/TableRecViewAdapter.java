package com.example.posapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class TableRecViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int HEADER_ROW_TYPE=0;
    public static final int REGULAR_ROW_TYPE=1;
    final private Context mContext;
    final private LayoutInflater layoutInflater;
    private ArrayList<AccountStatementOutline> accountStatementOutline;

    public TableRecViewAdapter(Context mContext) {
        this.mContext = mContext;
        this.layoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getItemViewType(int position) {
        if(0==position){
            return HEADER_ROW_TYPE;
        }
        else {
            return REGULAR_ROW_TYPE;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType==HEADER_ROW_TYPE) {
           View itemView=layoutInflater.inflate(R.layout.item_tableheader_outline, parent, false);
           return new ViewHolderHeaderRow(itemView);
        }
        else{
            View itemView = layoutInflater.inflate(R.layout.item_tableregular_outline, parent, false);
            return new ViewHolderRegularRow(itemView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(position==0){
            ViewHolderHeaderRow headeradapter = (ViewHolderHeaderRow) holder;
        }
        else{
            ViewHolderRegularRow regular_adapter= (ViewHolderRegularRow) holder;
            regular_adapter.transaction_type_ans.setText(accountStatementOutline.get(position - 1).getTransaction_type_ans());
            regular_adapter.beneficiary_bank_ans.setText(accountStatementOutline.get(position - 1).getBeneficiary_bank_ans());
            regular_adapter.txt_description_ans.setText(accountStatementOutline.get(position - 1).getDescription_ans());
            regular_adapter.amount_ans.setText(accountStatementOutline.get(position - 1).getAmount_ans());
            regular_adapter.txt_balance_ans.setText(accountStatementOutline.get(position - 1).getBalance_ans());
        }
    }

    @Override
    public int getItemCount() {
        return (accountStatementOutline.size() + 1);
    }
    public void setAccountStatementOutline(ArrayList<AccountStatementOutline> accountStatementOutline) {
        this.accountStatementOutline = accountStatementOutline;
        notifyDataSetChanged();

    }

    public class ViewHolderRegularRow extends RecyclerView.ViewHolder{
        private TextView transaction_type_ans, beneficiary_bank_ans, txt_description_ans,
        amount_ans, txt_balance_ans;

        public ViewHolderRegularRow(@NonNull View itemView) {
            super(itemView);
            transaction_type_ans=itemView.findViewById(R.id.tranasaction_type_ans);
            beneficiary_bank_ans=itemView.findViewById(R.id.Beneficiary_bank_ans);
            txt_description_ans=itemView.findViewById(R.id.txt_description_ans);
            amount_ans=itemView.findViewById(R.id.Amount_ans);
            txt_balance_ans=itemView.findViewById(R.id.txt_balance_ans);
        }

    }
    public class ViewHolderHeaderRow extends RecyclerView.ViewHolder{
       private TextView txt_transaction_type, txt_beneficiary_bank, txt_description,
        txt_amount, txt_balance;

//        public BreakIterator transaction_type_ans, beneficiary_bank_ans, txt_description_ans, amount_ans, txt_balance_ans;

        public ViewHolderHeaderRow(@NonNull View itemView) {
            super(itemView);

            txt_transaction_type=itemView.findViewById(R.id.txt_transaction_type);
            txt_beneficiary_bank=itemView.findViewById(R.id.txt_beneficiary_bank);
            txt_description=itemView.findViewById(R.id.txt_description);
            txt_amount=itemView.findViewById(R.id.txt_amount);
            txt_balance=itemView.findViewById(R.id.txt_balance);

            txt_transaction_type.setText(R.string.transaction_type);
            txt_beneficiary_bank.setText(R.string.beneficiary_bank);
            txt_description.setText(R.string.description);
            txt_amount.setText(R.string.amount);
            txt_balance.setText(R.string.balance);
        }
    }
}
