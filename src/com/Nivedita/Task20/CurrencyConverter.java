package com.Nivedita.Task20;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {
    public static BigDecimal convert(BigDecimal amount, BigDecimal exchangeRate){
        if(amount.compareTo(BigDecimal.ZERO)<0 || exchangeRate.compareTo(BigDecimal.ZERO)<=0){
            throw new IllegalArgumentException("Amount and exchange rate must be positive");
        }
        return amount.multiply(exchangeRate).setScale(2, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal(100);
        BigDecimal EUR = new BigDecimal(0.85);
        BigDecimal USD = new BigDecimal(1);
        BigDecimal GBD = new BigDecimal(1);
        System.out.println(convert(amount,EUR));
        System.out.println(convert(amount,USD));
        System.out.println(convert(amount,GBD));
    }
}
