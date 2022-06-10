package com.example.posapp;

public class TransactionWithdrawalOutline extends TransactionOutline {
    private String retrieval_reference_ans;
    private String authorization_code_ans;
    private String STAN_ans;
    private String masked_plan_ans;
    private String with_response_code_ans;

    public TransactionWithdrawalOutline(String transaction_type_ans, String transaction_status_ans, String transaction_reference_ans, String amount_ans,
                                        String beneficiary_name_ans, String beneficiary_bank_ans, String provider_reference_or_session_id_ans,
                                        String agent_name_ans, String terminal_id_ans, String serial_no_ans, String response_code_ans,
                                        String response_message_ans, String date_ans, String retrieval_reference_ans, String authorization_code_ans,
                                        String STAN_ans, String masked_plan_ans, String with_response_code_ans) {
        super(transaction_type_ans, transaction_status_ans, transaction_reference_ans, amount_ans, beneficiary_name_ans, beneficiary_bank_ans,
                provider_reference_or_session_id_ans, agent_name_ans, terminal_id_ans, serial_no_ans, response_code_ans, response_message_ans, date_ans);
        this.retrieval_reference_ans = retrieval_reference_ans;
        this.authorization_code_ans = authorization_code_ans;
        this.STAN_ans = STAN_ans;
        this.masked_plan_ans = masked_plan_ans;
        this.with_response_code_ans = with_response_code_ans;
    }



    public String getRetrieval_reference_ans() {
        return retrieval_reference_ans;
    }

    public String getAuthorization_code_ans() {
        return authorization_code_ans;
    }

    public String getSTAN_ans() {
        return STAN_ans;
    }

    public String getMasked_plan_ans() {
        return masked_plan_ans;
    }

    public String getWith_response_code_ans() {
        return with_response_code_ans;
    }



}
