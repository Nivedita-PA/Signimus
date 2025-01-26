package com.Nivedita.Task7.Interface;

public class PayPalPayment implements Payment{
    @Override
    public int pay(int amount) {
        return amount;
    }

    @Override
    public int refund(int amount) {
        return amount;
    }
}
