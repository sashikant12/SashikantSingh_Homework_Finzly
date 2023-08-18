package Question3.me;

public class Transaction {
    private boolean t;

    public boolean transaction(boolean t) {
        this.t=t;
        if(!this.t){

            System.out.println("Transaction is not done try again");
            return false;
        }
        else {
            System.out.println("The product key is" );
            return true;
        }
    }

}
