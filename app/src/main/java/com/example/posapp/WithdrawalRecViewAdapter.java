package com.example.posapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WithdrawalRecViewAdapter extends RecyclerView.Adapter<WithdrawalRecViewAdapter.ViewHolder> {

    final private Context mContext;
    final private LayoutInflater layoutInflater;
    private ArrayList<TransactionWithdrawalOutline> transactionWithdrawalOutline;


    public WithdrawalRecViewAdapter(Context mContext) {
        this.mContext = mContext;
        this.layoutInflater=LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView=layoutInflater.inflate(R.layout.withdrawal_item_outline,parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.transaction_type_ans.setText(transactionWithdrawalOutline.get(position).getTransaction_type_ans());
        holder.transaction_status_ans.setText(transactionWithdrawalOutline.get(position).getTransaction_status_ans());
        holder.transaction_reference_ans.setText(transactionWithdrawalOutline.get(position).getTransaction_reference_ans());
        holder.amount_ans.setText(transactionWithdrawalOutline.get(position).getAmount_ans());
        holder.beneficiary_name_ans.setText(transactionWithdrawalOutline.get(position).getBeneficiary_name_ans());
        holder.beneficiary_bank_ans.setText(transactionWithdrawalOutline.get(position).getBeneficiary_bank_ans());
        holder.provider_reference_or_session_id_ans.setText(transactionWithdrawalOutline.get(position).getProvider_reference_or_session_id_ans());
        holder.agent_name_ans.setText(transactionWithdrawalOutline.get(position).getAgent_name_ans());
        holder.terminal_id_ans.setText(transactionWithdrawalOutline.get(position).getTerminal_id_ans());
        holder.serial_no_ans.setText(transactionWithdrawalOutline.get(position).getSerial_no_ans());
        holder.response_code_ans.setText(transactionWithdrawalOutline.get(position).getResponse_code_ans());
        holder.response_message_ans.setText(transactionWithdrawalOutline.get(position).getResponse_message_ans());
        holder.retrieval_reference_ans.setText(transactionWithdrawalOutline.get(position).getRetrieval_reference_ans());
        holder.date_ans.setText(transactionWithdrawalOutline.get(position).getDate_ans());
        holder.authorization_code_ans.setText(transactionWithdrawalOutline.get(position).getAuthorization_code_ans());

    }

    @Override
    public int getItemCount() {
        return transactionWithdrawalOutline.size();
    }
    public void setTransactionWithdrawalOutline(ArrayList<TransactionWithdrawalOutline> transactionWithdrawalOutline){
        this.transactionWithdrawalOutline = transactionWithdrawalOutline;
        notifyDataSetChanged();
    }




    public class ViewHolder extends RecyclerView.ViewHolder{
        private ConstraintLayout ConstGenOutline, ChildConstGenOutline;
        private CardView CardviewGenOutline;
        private ScrollView scrollview;
        private ImageView imageView2;
        private TextView txt_transaction_type, txt_transaction_status, txt_transaction_reference, txt_amount,
        txt_beneficiary_name, txt_beneficiary_bank, txt_provider_reference_or_id_session, txt_agent_name, txt_terminal_id, txt_serial_no,
        txt_response_code, txt_response_message,txt_date, txt_retrieval_reference, txt_authorization_code;

        private TextView transaction_type_ans, transaction_status_ans, transaction_reference_ans, amount_ans, beneficiary_name_ans,
        beneficiary_bank_ans, provider_reference_or_session_id_ans, agent_name_ans, terminal_id_ans, serial_no_ans, response_code_ans,
        response_message_ans, date_ans, retrieval_reference_ans, authorization_code_ans;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        ConstGenOutline=itemView.findViewById(R.id.ConstGenOutline);
        ChildConstGenOutline=itemView.findViewById(R.id.ChildConstGenOutline);
        CardviewGenOutline=itemView.findViewById(R.id.CardviewGenOutline);
        scrollview=itemView.findViewById(R.id.scrollview);
       // imageView2=itemView.findViewById(R.id.imageView2);
        txt_transaction_type=itemView.findViewById(R.id.txt_transaction_type);
        txt_transaction_status=itemView.findViewById(R.id.txt_transaction_status);
        txt_transaction_reference=itemView.findViewById(R.id.txt_transaction_reference);
        txt_amount=itemView.findViewById(R.id.txt_amount);
        txt_beneficiary_name=itemView.findViewById(R.id.txt_beneficiary_name);
        txt_beneficiary_bank=itemView.findViewById(R.id.txt_beneficiary_bank);
        txt_provider_reference_or_id_session=itemView.findViewById(R.id.txt_provider_reference_or_session_id);
        txt_agent_name=itemView.findViewById(R.id.txt_agent_name);
        txt_terminal_id=itemView.findViewById(R.id.txt_terminal_id);
        txt_serial_no=itemView.findViewById(R.id.txt_serial_no);
        txt_response_code=itemView.findViewById(R.id.txt_response_code);
        txt_response_message=itemView.findViewById(R.id.txt_response_message);
        txt_date=itemView.findViewById(R.id.txt_date);
        txt_retrieval_reference=itemView.findViewById(R.id.txt_retrieval_reference);
        txt_authorization_code=itemView.findViewById(R.id.txt_authorization_code);

        transaction_type_ans=itemView.findViewById(R.id.tranasaction_type_ans);
        transaction_status_ans=itemView.findViewById(R.id.Transaction_status_ans);
        transaction_reference_ans=itemView.findViewById(R.id.Transaction_reference_ans);
        amount_ans=itemView.findViewById(R.id.Amount_ans);
        beneficiary_name_ans=itemView.findViewById(R.id.Beneficiary_name_ans);
        beneficiary_bank_ans=itemView.findViewById(R.id.Beneficiary_bank_ans);
        provider_reference_or_session_id_ans=itemView.findViewById(R.id.Provider_ans);
        agent_name_ans=itemView.findViewById(R.id.Agent_name_ans);
        terminal_id_ans=itemView.findViewById(R.id.Terminal_ID_ans);
        serial_no_ans=itemView.findViewById(R.id.Serial_no_ans);
        response_code_ans=itemView.findViewById(R.id.Response_code_ans);
        response_message_ans=itemView.findViewById(R.id.Response_message_ans);
        date_ans=itemView.findViewById(R.id.Date_ans);
        retrieval_reference_ans=itemView.findViewById(R.id.Retrieval_reference_ans);
        authorization_code_ans=itemView.findViewById(R.id.Authorization_code_ans);


        txt_transaction_status.setText(R.string.transaction_status);
        txt_transaction_type.setText(R.string.transaction_type);
        txt_transaction_reference.setText(R.string.transaction_reference);
        txt_amount.setText(R.string.amount);
        txt_beneficiary_name.setText(R.string.beneficiary_name);
        txt_beneficiary_bank.setText(R.string.beneficiary_bank);
        txt_provider_reference_or_id_session.setText(R.string.provider_reference_session_id);
        txt_agent_name.setText(R.string.agent_name);
        txt_terminal_id.setText(R.string.terminal_id);
        txt_serial_no.setText(R.string.serial_no);
        txt_response_code.setText(R.string.response_code);
        txt_response_message.setText(R.string.response_message);
        txt_date.setText(R.string.date);
        txt_retrieval_reference.setText(R.string.retrieval_reference);
        txt_authorization_code.setText(R.string.authorization_code);


//        scrollview.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                v.getParent().requestDisallowInterceptTouchEvent(false);
//                v.onTouchEvent(event);
//                return true;
//            }
//        });




    }
}

}

