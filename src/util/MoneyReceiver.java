package util;

public interface MoneyReceiver {
    void addFunds(int amount);  // Добавить средства
    boolean deductFunds(int amount);  // Списать средства
    int getBalance();  // Получить текущий баланс
}

