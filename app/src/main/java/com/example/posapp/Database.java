package com.example.posapp;

import java.util.ArrayList;

public class Database {
    private static Database instance;
    private static ArrayList<TransactionOutline> transactionOutlines;
    private static ArrayList<TransactionDepositOutline> transactionDepositOutline;
    private static ArrayList<TransactionWithdrawalOutline>transactionWithdrawalOutline;
    private static ArrayList<AccountStatementOutline> accountStatementOutline;

    public static ArrayList<AccountStatementOutline> getAccountStatementOutline() {
        return accountStatementOutline;
    }

    public static void setAccountStatementOutline(ArrayList<AccountStatementOutline> accountStatementOutline) {
        Database.accountStatementOutline = accountStatementOutline;

    }

    public static ArrayList<TransactionOutline> getTransactionOutlines() {
        return transactionOutlines;
    }

    public static void setTransactionOutlines(ArrayList<TransactionOutline> transactionOutlines) {
        Database.transactionOutlines = transactionOutlines;
    }

    public static ArrayList<TransactionDepositOutline> getTransactionDepositOutline() {
        return transactionDepositOutline;
    }

    public static void setTransactionDepositOutline(ArrayList<TransactionDepositOutline> transactionDepositOutline) {
        Database.transactionDepositOutline = transactionDepositOutline;
    }

    public static ArrayList<TransactionWithdrawalOutline> getTransactionWithdrawalOutline() {
        return transactionWithdrawalOutline;
    }

    public static void setTransactionWithdrawalOutline(ArrayList<TransactionWithdrawalOutline> transactionWithdrawalOutline) {
        Database.transactionWithdrawalOutline = transactionWithdrawalOutline;
    }

    private Database(){
        if(null==transactionOutlines)
            transactionOutlines=new ArrayList<>();
        if(null==transactionDepositOutline)
            transactionDepositOutline=new ArrayList<>();
        if(null==transactionWithdrawalOutline)
            transactionWithdrawalOutline=new ArrayList<>();
        initialData();
        if(null==accountStatementOutline)
            accountStatementOutline=new ArrayList<>();
        initialAccountStatementDemoData();
    }
    public void initialData(){
        transactionWithdrawalOutline.add(new TransactionWithdrawalOutline("n", "o", "p", "q",
                "r","s", "t", "u", "v", "w", "x",
                "y", "z","a", "b", "c", "d", "e"));
        transactionDepositOutline.add(new TransactionDepositOutline("z", "y", "x", "w",
                "v", "u", "t", "s","r", "q","p",
                "o", "n", "m", "l"));


    }
    public void initialAccountStatementDemoData(){
        accountStatementOutline.add(new AccountStatementOutline("Withdrawal", "UBA",
               "Ewa Agoyin", "#5000", "#2000" ));
        accountStatementOutline.add(new AccountStatementOutline("deposit", "GT Bank",
                "Crypto", "#1,000,000", "#3,000,000"));
        accountStatementOutline.add(new AccountStatementOutline("Deposit", "Wema Bank",
                "Parfait", "#3,000", "#4000"));
        accountStatementOutline.add(new AccountStatementOutline("Deposit", "Access Bank",
              "Maryland cookies", "#600", "#1000"));
    }
    public static Database getInstance(){
        if(instance==null) {
            instance = new Database();
        }
        return instance;
    }
}
