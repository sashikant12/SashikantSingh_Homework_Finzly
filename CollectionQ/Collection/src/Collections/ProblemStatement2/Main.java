package Collections.ProblemStatement2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Account> collection = new ArrayList<>();
        while(true) {
            System.out.println("1 add");
            System.out.println("2 Deposite");
            System.out.println("3 Wthdraw");
            System.out.println("4 list");
            System.out.println("5 to exit");
            int c = sc.nextInt();
            sc.nextLine();
            switch (c) {
                case 1:
                    System.out.println("enter name");
                     String name = sc.nextLine();
                    int adN = collection.size()+1;
                    Account account = new Account(name,adN);
                    collection.add(account);
                    break;
                case 2:
                    boolean t= true;
                    System.out.println("enter account number");
                    int d = sc.nextInt();
                    System.out.println("amount");
                    double b = sc.nextDouble();
                    for (Account e1 : collection) {
                        if(e1.getAccNo()==d){
                            System.out.println("dd");
                            e1.deposite(b);
                            t= false;
                            break;
                        }else {
                            System.out.println("d..");
                        }
                    }
                    if(t){
                    System.out.println("Bahut paisa hai kya , thick se account number dal");
                    break;
                    }
                    break;
                case 3:
                    boolean g = false;
                    System.out.println("enter account number");
                    int x = sc.nextInt();
                    System.out.println("amount");
                    double a = sc.nextDouble();
                    for (Account e1 : collection) {
                        if (e1.getAccNo() == x) {
                            System.out.println("w");
                            e1.withdrw(a);
                            g=true;
                            break;

                        }else {
                            System.out.println("w..");
                        }
                    }
                    if(!g){
                        System.out.println("no account");
                        break;
                    }
                    break;
                case 4:
                    for (Account w:collection) {
                        System.out.println(w);
                    }
                    break;
                case 5:
                    System.out.println("exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");
            }
        }
    }
}
