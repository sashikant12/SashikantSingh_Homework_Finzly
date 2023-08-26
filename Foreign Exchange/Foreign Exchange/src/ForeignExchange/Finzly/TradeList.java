package ForeignExchange.Finzly;

import java.util.List;
import java.util.Scanner;

public interface TradeList {
    abstract void bookTrade(Scanner sc, List<Trade> trades);

}
