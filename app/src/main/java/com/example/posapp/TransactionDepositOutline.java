package com.example.posapp;

public class TransactionDepositOutline extends TransactionOutline{

    private String dep_processing_fee_ans;
    private String dep_terminal_type_ans;

    public TransactionDepositOutline(String transaction_type_ans, String transaction_status_ans, String transaction_reference_ans, String amount_ans,
                                     String beneficiary_name_ans, String beneficiary_bank_ans, String provider_reference_or_session_id_ans,
                                     String agent_name_ans, String terminal_id_ans, String serial_no_ans, String response_code_ans,
                                     String response_message_ans, String date_ans, String dep_processing_fee_ans, String dep_terminal_type_ans) {
        super(transaction_type_ans, transaction_status_ans, transaction_reference_ans, amount_ans, beneficiary_name_ans, beneficiary_bank_ans,
                provider_reference_or_session_id_ans, agent_name_ans, terminal_id_ans, serial_no_ans, response_code_ans, response_message_ans, date_ans);
        this.dep_processing_fee_ans = dep_processing_fee_ans;
        this.dep_terminal_type_ans = dep_terminal_type_ans;
    }

    public String getDep_processing_fee_ans() {
        return dep_processing_fee_ans;
    }

    public void setDep_processing_fee_ans(String dep_processing_fee_ans) {
        this.dep_processing_fee_ans = dep_processing_fee_ans;
    }

    public String getDep_terminal_type_ans() {
        return dep_terminal_type_ans;
    }

    public void setDep_terminal_type_ans(String dep_terminal_type_ans) {
        this.dep_terminal_type_ans = dep_terminal_type_ans;
    }


}
