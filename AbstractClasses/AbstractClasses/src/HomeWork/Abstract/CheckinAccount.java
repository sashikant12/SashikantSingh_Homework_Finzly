package HomeWork.Abstract;

public class CheckinAccount extends BankAccount{
    private final double overDraft;
    public CheckinAccount(String accountNumber,String accountHolderName,double balance,double overDraft){
        super(accountNumber,accountHolderName,balance);
        this.overDraft=overDraft;
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

        if (super.balance - amount >= this.overDraft) {
            super.balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance is " + super.balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
            System.out.println("Balance is " + super.balance);
        }
    }
}
