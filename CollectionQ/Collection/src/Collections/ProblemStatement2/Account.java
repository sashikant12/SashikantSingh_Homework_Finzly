package Collections.ProblemStatement2;

public class Account {
    private String name;
    private  double balance=1000;
    private int adharNo;

    public Account() {
    }

    public Account(String name, int accNo) {
        this.name = name;
        this.adharNo = accNo;
//        this.balance=balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNo() {
        return adharNo;
    }

    public void setAccNo(int accNo) {
        this.adharNo = accNo;
    }
    public void deposite(double b){
        balance+=b;
    }
    public void withdrw(double b){
        if(b>0){
            if(balance-b>=0){
                balance-=b;
            }else {
                System.out.println("no money");

            }
        }else {
            System.out.println("kuch dhang se karle");
        }
    }

    @Override
    public String toString() {
        return "Account[" +
                "name =" + name +
                ", Account number = " + adharNo +
                ", balance = " + getBalance()+" ]";
    }
}
