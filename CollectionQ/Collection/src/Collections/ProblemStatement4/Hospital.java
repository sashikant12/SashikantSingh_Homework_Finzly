package Collections.ProblemStatement4;

import java.util.HashMap;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Patient> hashMap = new HashMap<>();
        while(true){
            System.out.println("1 add");
            System.out.println("2 view");
            System.out.println("3 search on id");
            System.out.println("4 to exit");
            int c= sc.nextInt();
            sc.nextLine();
            switch (c){
                case 1:
                    int id =hashMap.size()+1;
                    System.out.println("enter name");
                    String name = sc.nextLine();
                    System.out.println("enter disease");
                    String disease =sc.nextLine();
                    Patient patient = new Patient(id,name,disease);
                    hashMap.put(id,patient);
                    break;
                case 2:
                for (int i : hashMap.keySet() ){
                    System.out.println(hashMap.get(i));
                }
                    break;
                case 3:
                    System.out.println("Display patient id");
                    int d = sc.nextInt();
                    if(hashMap.containsKey(d)){
                        System.out.println(hashMap.get(d));
                    }else{
                        System.out.println("Not found");
                    }
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


