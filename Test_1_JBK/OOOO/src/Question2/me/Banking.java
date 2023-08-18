package Question2.me;

public class Banking {

    private String ownerName;
    private int balance;
    private int accountNumber;

    public Banking(String ownerName, int accountNumber) {
        this.ownerName = ownerName;
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int deposite(int deposite){
        this.balance+=deposite;
        return balance;
    }
    public int withdrawing(int withdrawing){
       if(withdrawing<=this.balance)
        this.balance-=withdrawing;
       else {
           System.out.println("No balance");
           return this.balance;
       }
        return balance;
    }


    public static void main(String[] args) {
        Banking b = new Banking("SASHI",1122333);
        b.setBalance(1000);
        b.deposite(100);
        System.out.println(b.getBalance());
        b.withdrawing(10000);
        System.out.println(b.getBalance());
        System.out.println(b.getBalance());


    }
}
