package ForeignExchange.Finzly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Trade> trades = new ArrayList<>();
        TradeBook tradeBook = new TradeBook();
        TradePrint tradePrint = new TradePrint();
        TradeExit tradeExit = new TradeExit();

        while (true) {
            System.out.println("-".repeat(200));
            System.out.println("WELCOME TO FOREIGN EXCHANGE CENTRE");
            System.out.println("Book Trades:   1");
            System.out.println("Print Trades:  2");
            System.out.println("Exit:          3");

            String choice = sc.nextLine();

            if (!choice.matches("[1-3]")) {
                System.out.println("Invalid input. Please enter a valid choice (1, 2, or 3)");
                continue;
            }

            int choices = Integer.parseInt(choice);

            switch (choices) {
                case 1:
                    tradeBook.bookTrade(sc, trades);
                    break;
                case 2:
                    tradePrint.printTrades(trades);
                    break;
                case 3:
                    tradeExit.exitProgram(sc);
                    break;
            }
        }
    }
}
