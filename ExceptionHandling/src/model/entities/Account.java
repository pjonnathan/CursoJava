package model.entities;

import model.exeption.DomainException;

public class Account {
    private Integer number;
    private String holderName;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holderName, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holderName = holderName;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if (this.balance < 0) {
            throw new DomainException("insufficient balance");
        }
        if (amount > this.withdrawLimit) {
            throw new DomainException("withdrawal exceeding limit");
        }
        this.balance -= amount;
    }
}
