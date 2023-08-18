package HomeWork.Abstract;

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String getAccountNumber() {
        return super.accountNumber;
    }

    @Override
    public String getAccountHolderName() {
        return super.accountHolderName;
    }

    @Override
    public double getBalance() {
        return super.balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            super.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    @Override
    public void withdraw(double amount) {
        double minBalance = 100.0; // Minimum balance required for withdrawal
        if (super.balance - amount >= minBalance) {
            super.balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance is " + super.balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
            System.out.println("Balance is " + super.balance);
        }
    }
}

