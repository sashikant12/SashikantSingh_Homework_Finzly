package ForeignExchange.Finzly;

public class Trade {
    // Properties
    private final String name;
    private final double transfer;
    private final  String currencyPair;
    private static double rate ;
    private int tradeNo = 0;
    private double inrValue;

    // Constructor
    public Trade(String name, double transfer, String currencyPair) {
        this.name = name.toUpperCase();
        this.transfer = transfer;
        this.currencyPair = currencyPair.toUpperCase();

        if (currencyPair.equalsIgnoreCase("USDINR")) {
            rate = 90;
        }
    }

    // Setter for trade number
    public void setTradeNo(int tradeNo) {
        this.tradeNo = tradeNo;
    }

    // Setter for INR rate
    public void setInrRate(double inrRate) {
        this.inrValue = inrRate;
    }

    // Getter for customer name
    public String getName() {
        return name;
    }

    // Getter for transfer amount
    public double getTransfer() {
        return transfer;
    }

    // Getter for currency pair
    public String getCurrencyPair() {
        return currencyPair;
    }

    // Getter for rate
    public double getRate() {
        return rate;
    }

    // Getter for trade number
    public int getTradeNo() {
        return tradeNo;
    }

    // Override toString method for displaying trade information
    @Override
    public String toString() {
        return getTradeNo() + "       \t " + currencyPair + "       " + name + "    \t     " +getCurrencyPair().substring(3,6)+
                String.format("%.2f", inrValue) + "      " + rate;
    }
}
