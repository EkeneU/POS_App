package com.example.posapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DepositRecViewAdapter extends RecyclerView.Adapter<DepositRecViewAdapter.ViewHolder>{
    final private Context mContext;
    final private LayoutInflater layoutInflater;
    private ArrayList<TransactionDepositOutline> transactionDepositOutlines =new ArrayList<>();

    public DepositRecViewAdapter(Context mContext, LayoutInflater layoutInflater) {
        this.mContext = mContext;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView=layoutInflater.inflate(R.layout.deposit_item_outline,parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.transaction_type_ans.setText(transactionDepositOutlines.get(position).getTransaction_type_ans());
        holder.transaction_status_ans.setText(transactionDepositOutlines.get(position).getTransaction_type_ans());
        holder.txt_transaction_reference.setText(transactionDepositOutlines.get(position).getTransaction_reference_ans());
        holder.txt_amount.setText(transactionDepositOutlines.get(position).getAmount_ans());
        holder.txt_beneficiary_name.setText(transactionDepositOutlines.get(position).getBeneficiary_name_ans());
        holder.txt_beneficiary_bank.setText(transactionDepositOutlines.get(position).getBeneficiary_bank_ans());
        holder.txt_provider_reference_or_id_session.setText(transactionDepositOutlines.get(position).getProvider_reference_or_session_id_ans());
        holder.txt_agent_name.setText(transactionDepositOutlines.get(position).getAgent_name_ans());
        holder.txt_terminal_id.setText(transactionDepositOutlines.get(position).getTerminal_id_ans());
        holder.txt_serial_no.setText(transactionDepositOutlines.get(position).getSerial_no_ans());
        holder.txt_response_code.setText(transactionDepositOutlines.get(position).getResponse_code_ans());
        holder.txt_response_message.setText(transactionDepositOutlines.get(position).getResponse_message_ans());
        holder.Dep_p_fee_ans.setText(transactionDepositOutlines.get(position).getDep_processing_fee_ans());
        holder.Dep_term_type_ans.setText(transactionDepositOutlines.get(position).getDep_terminal_type_ans());


    }

    @Override
    public int getItemCount() {
        return transactionDepositOutlines.size();
    }
    public void setTransactionDepositOutline(ArrayList<TransactionDepositOutline> transactionDepositOutlines){
        this.transactionDepositOutlines = transactionDepositOutlines;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ConstraintLayout ConstGenOutline, ChildConstGenOutline;
        private CardView CardviewGenOutline;
        private ScrollView scrollview;
        private ImageView imageView2;
        private TextView txt_transaction_type, txt_transaction_status, txt_transaction_reference, txt_amount,
                txt_beneficiary_name, txt_beneficiary_bank, txt_provider_reference_or_id_session, txt_agent_name, txt_terminal_id, txt_serial_no,
                txt_response_code, txt_response_message, dep_processing_fee, dep_terminal_type;

        private TextView transaction_type_ans, transaction_status_ans, transaction_reference_ans, amount_ans, beneficiary_name_ans,
                beneficiary_bank_ans, provider_reference_or_session_id_ans, agent_name_ans, terminal_id_ans, serial_no_ans, response_code_ans,
                response_message_ans, Dep_p_fee_ans, Dep_term_type_ans;

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
            dep_processing_fee=itemView.findViewById(R.id.txt_dep_process_fee);
            dep_terminal_type=itemView.findViewById(R.id.txt_dep_terminal_type);



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
            Dep_p_fee_ans=itemView.findViewById(R.id.Dep_p_fee_ans);
            Dep_term_type_ans=itemView.findViewById(R.id.Dep_term_type_ans);

            txt_transaction_status.setText(R.string.transaction_status);
            txt_transaction_type.setText(R.string.transaction_reference);
            txt_transaction_reference.setText(R.string.amount);
            txt_beneficiary_name.setText(R.string.beneficiary_name);
            txt_beneficiary_bank.setText(R.string.beneficiary_bank);
            txt_provider_reference_or_id_session.setText(R.string.provider_reference_session_id);
            txt_agent_name.setText(R.string.agent_name);
            txt_terminal_id.setText(R.string.terminal_id);
            txt_serial_no.setText(R.string.serial_no);
            txt_response_code.setText(R.string.response_code);
            txt_response_code.setText(R.string.response_message);
        }
    }
}
