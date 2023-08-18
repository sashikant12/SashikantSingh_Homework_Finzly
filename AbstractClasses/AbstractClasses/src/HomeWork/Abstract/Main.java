package HomeWork.Abstract;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123456", "John", 100, 0.05);
        savingsAccount.deposit(200.0);
        savingsAccount.withdraw(500.0);

        System.out.println("Account Holder: " + savingsAccount.getAccountHolderName());
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());

        CheckinAccount c = new CheckinAccount("112233","Sashi ",910000,10000);
        c.deposit(1000);
        c.withdraw(91002020);
        System.out.println(c.accountHolderName);
        System.out.println(c.accountNumber);
    }

}
