package com.example.posapp;

public class AccountStatementOutline {
    private String transaction_type_ans;
    private String beneficiary_bank_ans;
    private String description_ans;
    private String amount_ans;
    private String balance_ans;

    public AccountStatementOutline(String transaction_type_ans, String beneficiary_bank_ans, String description_ans,
                                   String amount_ans, String balance_ans) {
        this.transaction_type_ans = transaction_type_ans;
        this.beneficiary_bank_ans = beneficiary_bank_ans;
        this.description_ans = description_ans;
        this.amount_ans = amount_ans;
        this.balance_ans = balance_ans;
    }

    public String getTransaction_type_ans() {
        return transaction_type_ans;
    }

    public void setTransaction_type_ans(String transaction_type_ans) {
        this.transaction_type_ans = transaction_type_ans;
    }

    public String getBeneficiary_bank_ans() {
        return beneficiary_bank_ans;
    }

    public void setBeneficiary_bank_ans(String beneficiary_bank_ans) {
        this.beneficiary_bank_ans = beneficiary_bank_ans;
    }

    public String getDescription_ans() {
        return description_ans;
    }

    public void setDescription_ans(String description_ans) {
        this.description_ans = description_ans;
    }

    public String getAmount_ans() {
        return amount_ans;
    }

    public void setAmount_ans(String amount_ans) {
        this.amount_ans = amount_ans;
    }

    public String getBalance_ans() {
        return balance_ans;
    }

    public void setBalance_ans(String balance_ans) {
        this.balance_ans = balance_ans;
    }


}
