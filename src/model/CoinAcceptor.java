package model;

import util.MoneyReceiver;

public class CoinAcceptor implements MoneyReceiver {
    private int balance;

    public CoinAcceptor(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void addFunds(int amount) {
        balance += amount;
    }

    @Override
    public boolean deductFunds(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}

