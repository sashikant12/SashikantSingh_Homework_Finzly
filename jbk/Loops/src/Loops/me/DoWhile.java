package Loops.me;

public class DoWhile {
    public static void main(String[] args) {
        ///1
        int i=0;
        do {
            System.out.print(i + " ");
            i++;
        }while (i<=25);
        System.out.println();
        //2
        i=25;
        do {
            System.out.print(i + " ");
            i--;
        }while (i>0);
        System.out.println();
        //3
        i=0;
        do {
            if(i%2==0)
            System.out.print(i + " ");
            i++;
        }while (i<=100);
        System.out.println();
        //4
        i=0;
        do {
            if(i%2!=0)
                System.out.print(i + " ");
            i++;
        }while (i<=100);
        System.out.println();
        //5
        i=0;
        int sum=0;
        do {
            if(i%2!=0)
                sum=sum+i;
            i++;
        }while (i<=50);
        System.out.println(sum);
        //6
        i=0;
         sum=0;
        do {
            if(i%2==0)
                sum=sum+i;
            i++;
        }while (i<=50);
        System.out.println(sum);
        //7
        i=-45;
        do {
            System.out.print(i+" ");
            i++;
        }while (i<=45);
        System.out.println();
        //8
        i=50;
        do {
            System.out.print(i+" ");
            i++;
        }while (i<=100);
        System.out.println();
        //9
        i=0;
        int odd=0,even=0;
        do {
            if (i % 2 != 0)
                odd += i;
            else even += i;
            i++;
        }while (i<=100);
        System.out.print(even+" " + odd);
        System.out.println();
        //10
        //even
        i=0;
        System.out.println("even : ");
        do {
            if(i%2==0) System.out.print(i+" ");
            i++;
        }while (i<=100);
        System.out.println();
        System.out.println("odd : ");
        i=0;
        do {
            if(i%2!=0) System.out.print(i+" ");
            i++;
        }while (i<=100);
        System.out.println();
        //11
        i=1;
        do {
            System.out.print(i + " ");
            i++;
        }while (i<=100);
        System.out.println();
        //12
        i=100;
        do {
            System.out.print(i + " ");
            i--;
        }while (i>0);
        System.out.println();
        //13
        i=30;
        do {
            System.out.print(i + " ");
            i++;
        }while (i<50);
        System.out.println();
        //14
        i=1;
        do {
            if(i%2==0)
            System.out.print(i + " ");
            i++;
        }while (i<25);
        System.out.println();
        //15
        i=1;
        do {
            if(i%2!=0)
                System.out.print(i + " ");
            i++;
        }while (i<=25);
        System.out.println();
        System.out.println();
        System.out.println();

        //Series
        System.out.println("SERIES");
        System.out.println();
        System.out.println();
//1
        i=1;
        do {
            if(i%2==0)
                System.out.print(i+" ");
            i++;
        }while (i<=20);
        System.out.println();

    //2
        i=1;
        do {
            if(i%9==0)
                System.out.print(i+" ");
            i++;
        }while (i<=90);
        System.out.println();
//3
        i=1;
        do {
            if(i%2==0)
                System.out.print(-i+" ");
            else System.out.print(i+" ");
            i++;
        }while (i<=10);
        System.out.println();
        //4
        i=1;
        do {
            if(i%5==0)
                System.out.print(i+" ");
            i++;
        }while (i<=50);
        System.out.println();
        //5
        i=1;
        do {
            System.out.print(i+" ");
            i=i*10;
        }while (i<=1000);
        System.out.println();

        //6
        i=1;
        sum=0;
        do {
            sum=sum+i;
            System.out.print(sum+" ");
            i++;
        }while (i<10);
        System.out.println();
        //7
        i=1;
        do {
            if(i%8==0)
                System.out.print(i+" ");
            i++;
        }while (i<=80);
        System.out.println();
        //8
        i=1;
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2+" ");
        do {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            i++;
        }while (i<=10);
        System.out.println();
        //9
        i=1;
        do {
            int d = i*i;
                System.out.print(d+" ");
            i++;
        }while (i<=10);
        System.out.println();
        //10
        i=1;
        do {
            if(i%3==0)
                System.out.print(i+" ");
            i++;
        }while (i<=30);
        System.out.println();
        //11
        i=1;
        do {
            if(i%7==0)
                System.out.print(i+" ");
            i++;
        }while (i<=70);
        System.out.println();
        //12
        i=1;
        do {
            if(i%4==0)
                System.out.print(i+" ");
            i++;
        }while (i<=40);
        System.out.println();
        //13
        i=1;
        do {
            if(i%10==0)
                System.out.print(i+" ");
            i++;
        }while (i<=100);
        System.out.println();
        //14
        i=1;
        do {
                System.out.print(i+" ");
            i++;
        }while (i<5);
        do {
            System.out.print(i+" ");
            i--;
        }while (i>0);
        System.out.println();
        //15
        i=1;
        do {
            if(i%6==0)
                System.out.print(i+" ");
            i++;
        }while (i<=60);
        System.out.println();
    }


}
