import model.CoinAcceptor;
import util.MoneyReceiver;

public class Main {
    public static void main(String[] args) {
        MoneyReceiver processor = new CoinAcceptor(120);
        AppRunner.run(processor);
    }
}
