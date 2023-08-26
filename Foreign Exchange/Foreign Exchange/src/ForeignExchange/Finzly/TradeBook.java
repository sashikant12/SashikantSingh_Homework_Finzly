package ForeignExchange.Finzly;

import java.util.List;
import java.util.Scanner;

public class TradeBook implements TradeList {

    public void bookTrade(Scanner sc, List<Trade> trades) {

        while (true) {
            //customer name
            System.out.println("Enter customer Name");
            String customerName = sc.nextLine();
            if (customerName.trim().equals("")) {
                System.out.println("Please provide valid name");
                System.out.println("-".repeat(200));
                continue;

            }
            // check weather name contain only alphabet
           if (!customerName.matches("^[a-zA-Z ]+.$")) {
                System.out.println("Try again with valid name");
                System.out.println("-".repeat(200));
                continue;
            }
            //currency exchange
            System.out.println("Enter Currency Pair");
            String currencyPair = sc.nextLine();
            // check currency pair
            if (!currencyPair.equalsIgnoreCase("USDINR")) {
                System.out.println("Invalid currency pair. Only USDINR is supported.");
                System.out.println("-".repeat(200));
                continue;
            }
            // amount to transfer
            System.out.println("Enter amount to transfer");


            String a = sc.nextLine();
            double amount = 0;
            //pattern for double
            if (a.matches("^[-+]?\\d*\\.?\\d+(?:[eE][-+]?\\d+)?$")) {
                double amounts = Double.parseDouble(a);
                amount = amounts;
            }
            //check weather amount is valid or not
            if (amount < 1) {
                System.out.println("Minimum transfer amount is 1 " + currencyPair.substring(0, 3).toUpperCase());
                System.out.println("Thank you please try again");
                System.out.println("-".repeat(200));
                continue;

            }

            // calling constructor
            Trade trade = new Trade(customerName, amount, currencyPair);

            // calculate number
            double totalAmount = trade.getTransfer() * trade.getRate();
            // set the inrRate
            trade.setInrRate(totalAmount);

            // You want to see the rate
            System.out.println("Do you want to get the rate (Yes/No)");
            String wantRate = sc.nextLine();
            // get rate
            while (true) {
                if (wantRate.equalsIgnoreCase("yes")) {
                    System.out.println("You are transferring " + trade.getCurrencyPair().substring(3, 6) + " " + totalAmount + " to " + trade.getName() +
                            " ( Assuming that rate was " + trade.getRate() + ")");
                    break;
                } else if (wantRate.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'Yes' or 'No'");
                    wantRate = sc.nextLine(); // Read input again
                }
            }
            //book trade
            while (true) {
                System.out.println("Book/Cancel this trade");
                String decision = sc.nextLine();

                if (decision.equalsIgnoreCase("book") && trade.getCurrencyPair().equalsIgnoreCase("USDINR")) {
                    // add to list
                    trades.add(trade);
                    // set trade number
                    trade.setTradeNo(trades.size());

                    System.out.println("Trade for " + trade.getCurrencyPair() + " has been booked with rate " +
                            trade.getRate() + ", The amount of Rs " + totalAmount + " will be transferred in 2 working days to " +
                            trade.getName());

                    break;
                } else if (decision.equalsIgnoreCase("cancel")) {
                    System.out.println("Trade is Canceled");
                    System.out.println("Please try again");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'Book' or 'Cancel'");
                }
            }
            break;
        }
    }
}

