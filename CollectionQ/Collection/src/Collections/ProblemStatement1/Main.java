package Collections.ProblemStatement1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Employee> collection = new ArrayList<>();
        while(true){
        System.out.println("1 add");
        System.out.println("2 view");
        System.out.println("3 search on id");
        System.out.println("4 to exit");
        int c= sc.nextInt();
        sc.nextLine();
        switch (c){
            case 1:
                int id =collection.size()+1;
                System.out.println("enter name");
                String name = sc.nextLine();
                System.out.println("enter dept");
                String dept =sc.nextLine();
                Employee e=new Employee(id,name,dept);
                collection.add(e);
                break;
            case 2:
                System.out.println("to view");
                for (Employee e1 : collection) {
                    System.out.println(e1);
                }
                break;
            case 3:
                System.out.println("enter id");
                int d  = sc.nextInt();
                for (Employee e1 : collection) {
                    if (d == e1.getIds()) {
                        System.out.println(e1);
                        break;
                    }
                }
                System.out.println("please put an valid input Id");
                break;

            case 4 :
                System.out.println("exit");
                System.exit(0);
                break;
            default:
                System.out.println("invalid input");
            }
        }
    }
}
