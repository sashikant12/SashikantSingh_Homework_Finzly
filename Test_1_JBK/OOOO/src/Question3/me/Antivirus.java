package Question3.me;
import java.util.Scanner;
public class Antivirus {
    final int productKey=12345;


    public Antivirus() {
        System.out.println("You are using free version, please upgrade");
    }
    public Antivirus(Transaction tranction){
        Scanner s = new Scanner(System.in);
        boolean b =s.nextBoolean();
    if(tranction.transaction(b)){
        System.out.println(  productKey);
    }
    else{
        System.out.println("First activate the product key");
    }
    }

    public static void main(String[] args) {
        Transaction t = new Transaction();
        Antivirus a = new Antivirus();
        Antivirus b = new Antivirus(t);
        Antivirus c = new Antivirus(t);
    }
}
