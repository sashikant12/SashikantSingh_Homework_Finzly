package ForeignExchange.Finzly;

import java.util.Scanner;

public class TradeExit {

    public void exitProgram(Scanner sc) {
        //checking weather exit or not
        while (true) {
            System.out.println("Do you really want to exit (y/n)");
            String exit = sc.nextLine();

            if (exit.equalsIgnoreCase("y")) {
                System.out.println("Bye - have a good day");
                System.exit(0);
            } else if(exit.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter y for yes or n for no");
            }
        }
    }
}
