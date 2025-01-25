package com.Nivedita.Task4;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double accountBalance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String depositMoney(int i) {
        this.accountBalance += i;
        return "Account balance updated !";
    }

    public String withdrawMoney(int i) {
        if(this.accountBalance>=i) this.accountBalance -= i;
        else return "Insufficient Fund !";
        return "Account balance updated !";
    }
}
