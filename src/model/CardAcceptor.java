package model;

import util.MoneyReceiver;

import java.util.Scanner;

public class CardAcceptor implements MoneyReceiver {
    private int balance;

    @Override
    public void addFunds(int amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер карты:");
        String cardNumber = scanner.nextLine();
        System.out.println("Введите одноразовый пароль:");
        String password = scanner.nextLine();
        System.out.println("Оплата успешно произведена! Баланс пополнен на " + amount);
        balance += amount;
    }

    @Override
    public boolean deductFunds(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        System.out.println("Недостаточно средств на карте.");
        return false;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
