package com.example.posapp;

public class TransactionOutline {
    private String transaction_type_ans;
    private String transaction_status_ans;
    private String transaction_reference_ans;
    private String amount_ans;
    private String beneficiary_name_ans;
    private String beneficiary_bank_ans;
    private String provider_reference_or_session_id_ans;
    private String agent_name_ans;
    private String terminal_id_ans;
    private String serial_no_ans;
    private String response_code_ans;
    private String response_message_ans;
    private String date_ans;

    public TransactionOutline(String transaction_type_ans, String transaction_status_ans, String transaction_reference_ans, String amount_ans,
                              String beneficiary_name_ans, String beneficiary_bank_ans, String provider_reference_or_session_id_ans,
                              String agent_name_ans, String terminal_id_ans, String serial_no_ans, String response_code_ans, String response_message_ans,
                              String date_ans) {
        this.transaction_type_ans = transaction_type_ans;
        this.transaction_status_ans = transaction_status_ans;
        this.transaction_reference_ans = transaction_reference_ans;
        this.amount_ans = amount_ans;
        this.beneficiary_name_ans = beneficiary_name_ans;
        this.beneficiary_bank_ans = beneficiary_bank_ans;
        this.provider_reference_or_session_id_ans = provider_reference_or_session_id_ans;
        this.agent_name_ans = agent_name_ans;
        this.terminal_id_ans = terminal_id_ans;
        this.serial_no_ans = serial_no_ans;
        this.response_code_ans = response_code_ans;
        this.response_message_ans = response_message_ans;
        this.date_ans = date_ans;
    }




    public String getTransaction_type_ans() {
        return transaction_type_ans;
    }

    public void setTransaction_type_ans(String transaction_type_ans) {
        this.transaction_type_ans = transaction_type_ans;
    }

    public String getTransaction_status_ans() {
        return transaction_status_ans;
    }

    public void setTransaction_status_ans(String transaction_status_ans) {
        this.transaction_status_ans = transaction_status_ans;
    }

    public String getTransaction_reference_ans() {
        return transaction_reference_ans;
    }

    public void setTransaction_reference_ans(String transaction_reference_ans) {
        this.transaction_reference_ans = transaction_reference_ans;
    }

    public String getAmount_ans() {
        return amount_ans;
    }

    public void setAmount_ans(String amount_ans) {
        this.amount_ans = amount_ans;
    }

    public String getBeneficiary_name_ans() {
        return beneficiary_name_ans;
    }

    public void setBeneficiary_name_ans(String beneficiary_name_ans) {
        this.beneficiary_name_ans = beneficiary_name_ans;
    }

    public String getBeneficiary_bank_ans() {
        return beneficiary_bank_ans;
    }

    public void setBeneficiary_bank_ans(String beneficiary_bank_ans) {
        this.beneficiary_bank_ans = beneficiary_bank_ans;
    }

    public String getProvider_reference_or_session_id_ans() {
        return provider_reference_or_session_id_ans;
    }

    public void setProvider_reference_or_session_id_ans(String provider_reference_or_session_id_ans) {
        this.provider_reference_or_session_id_ans = provider_reference_or_session_id_ans;
    }

    public String getAgent_name_ans() {
        return agent_name_ans;
    }

    public void setAgent_name_ans(String agent_name_ans) {
        this.agent_name_ans = agent_name_ans;
    }

    public String getTerminal_id_ans() {
        return terminal_id_ans;
    }

    public void setTerminal_id_ans(String terminal_id_ans) {
        this.terminal_id_ans = terminal_id_ans;
    }

    public String getSerial_no_ans() {
        return serial_no_ans;
    }

    public void setSerial_no_ans(String serial_no_ans) {
        this.serial_no_ans = serial_no_ans;
    }

    public String getResponse_code_ans() {
        return response_code_ans;
    }

    public void setResponse_code_ans(String response_code_ans) {
        this.response_code_ans = response_code_ans;
    }

    public String getResponse_message_ans() {
        return response_message_ans;
    }

    public void setResponse_message_ans(String response_message_ans) {
        this.response_message_ans = response_message_ans;
    }
    public String getDate_ans() {
        return date_ans;
    }
    public void setDate_ans(String date_ans) {
        this.date_ans = date_ans;
    }
}