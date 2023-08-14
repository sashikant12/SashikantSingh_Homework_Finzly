package me.Vowel;

import java.util.Scanner;
public class Main {
    int b=10;
    public static void main(String[] args) {
//        System.out.println(b);
        int o=10;o++;
        System.out.println(o);
        Scanner sc = new Scanner(System.in);
        String v = "aAeEiIoOuU";
        System.out.println("Enter String");
        String name1 = sc.nextLine();
        char str[]=name1.toCharArray();
        // lowerCase
        //  String name = name1.toLowerCase();
        //OR
        for(int i=0;i<str.length;i++)
        {
            if(str[i]>='A' && str[i]<='Z')
            {
                str[i]=(char)((int)str[i]+32);
            }
        }
        int d=0,s=0;
        for(int i=0;i<v.length();i++){
            for(int j=0;j<name1.length();j++){
             if(v .charAt(i)==name1.charAt(j)){
                 d++;
                 s += d;
                 d=0;
                 break;
             }
            if(s==5)break;
            }
        }
            if(s==5){
                System.out.println("accepted");
            }
            else {
                System.out.println("not accepted");
            }
    }
}