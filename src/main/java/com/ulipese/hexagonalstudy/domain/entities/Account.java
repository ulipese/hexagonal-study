package com.ulipese.hexagonalstudy.domain.entities;

import java.math.BigDecimal;

public class Account {
    private String id;
    private BigDecimal balance;


    public Account(String id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public void transfer(Account target, BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) {
            throw new IllegalStateException("Insufficient funds");
        }

        this.balance = this.balance.subtract(amount);
        target.balance = target.balance.add(amount);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
