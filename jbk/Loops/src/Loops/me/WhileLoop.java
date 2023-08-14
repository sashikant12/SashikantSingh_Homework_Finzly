package Loops.me;

public class WhileLoop {
    public static void main(String[] args) {
        //1
        int i = 0;
        while (i <= 25) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //2
        i = 25;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        //3
        i = 0;
        while (i <= 100) {
            if (i % 2 != 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //4
        i = 0;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //5
        i = 0;
        int sum = 0;
        while (i <= 50) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.print(sum);
        System.out.println();
        //6
        i = 0;
        sum = 0;
        while (i <= 50) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.print(sum);
        System.out.println();
        //7
        i = -45;
        while (i <= 45) {

            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //8
        i = 50;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //9
        i = 0;
        int odd = 0, even = 0;
        while (i <= 100) {
            if (i % 2 != 0)
                odd += i;
            else even += i;
            i++;
        }
        System.out.print(odd + " " + even);
        System.out.println();
        //10
        i = 0;
        System.out.print("even : ");
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i++;

        }
        System.out.println();
        i = 0;
        System.out.print("odd : ");
        while (i <= 100) {
            if (i % 2 != 0)
                System.out.print(i + " ");
            i++;

        }
        System.out.println();
        //11

        i = 1;
        while (i <= 100) {

            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //12
        i=100;
        while (i>=1){

            System.out.print(i+" ");
            i--;
        }
        System.out.println();
        //13
        i=30;
        while (i<=50){

            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //14
        i=1;
        while (i<=25){
            if(i%2==0)
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
//
        //15
        i=1;
        while (i<=25){
            if(i%2!=0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();
        System.out.println();
        System.out.println();










        //////   Series
        System.out.println("SERIES");
        System.out.println();


//1
        i=1;
        while (i<=20){
            if(i%2==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //2
        i=1;
        while (i<=20){
            if(i%3==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //3
        i=1;
        while (i<=20){
            if(i%2==0)
                System.out.print(-i+" ");
            else System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //4
        i=1;
        while (i<=20){
            if(i%5==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //5
        i=1;
        while (i<=1000){
            i=i*10;
            System.out.print(i+" ");
        }
        System.out.println();
        //6
        i=1;
        sum=0;
        while (i<10){
            sum=sum+i;
            System.out.print(sum+" ");
            i++;
        }
        System.out.println();
        //7
        i=1;
        while (i<=80){
            if(i%8==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //8
        i=2;
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+ n2 +" ");
        while (i<9){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            i++;
        }
        System.out.println();
        //9
        i=1;
        while (i<=10){
            int d=i*i;
                System.out.print(d+" ");
            i++;
        }
        System.out.println();
        //10
        i=1;
        while (i<=30){
            if(i%3==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //11
        i=1;
        while (i<=70){
            if(i%7==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //12
        i=1;
        while (i<=40){
            if(i%4==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //13
        i=1;
        while (i<=100){
            if(i%10==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //14
        i=1;
        while (i<5){

            System.out.print(i+" ");
            i++;
        }

        while (i>0){

            System.out.print(i+" ");
i--;
        }

        System.out.println();
        //15
        i=1;
        while (i<=60){
            if(i%6==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}