package ForeignExchange.Finzly;

import java.util.List;

public class TradePrint {
    // for printing purpose
    public void printTrades(List<Trade> trades) {
        // Your existing code for printing trades...
        System.out.println("TradeNo\tCurrencyPair\tCustomerName\tAmount\t\t\t\tRate");
        //trade to string for each object creation
        int tradeno=1;
        for (Trade t : trades) {
            System.out.println(t.toString());
        }
    }
}
