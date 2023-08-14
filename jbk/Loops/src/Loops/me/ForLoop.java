package Loops.me;

public class ForLoop {
    public static void main(String[] args) {
        //1
        for(int i=1;i<=25;i++){
                System.out.print(i+" ");
        }
        System.out.println();
        //2
        for(int i=25;i>=1;i--){
                System.out.print(i+" ");
        }
        System.out.println();
        //3
        for(int i=0;i<=100;i++){
            if(i%2!=0)
                System.out.print(i+" ");
        }
        System.out.println();
        //4
        for(int i=0;i<=100;i++){
            if(i%2==0)
                System.out.print(i+" ");
        }
        System.out.println();
        //5
        int sum=0;
        for(int i=0;i<=50;i++){
            if(i%2!=0)sum+=i;

        }
        System.out.print(sum+" ");
        System.out.println();
        //6
        sum=0;
        for(int i=0;i<=50;i++){
            if(i%2==0)sum+=i;

        }
        System.out.print(sum+" ");
        System.out.println();
        //7
        for(int i=-45;i<=45;i++){
            System.out.print(i+" ");
        }

        System.out.println();
        //8
        for(int i=50;i<=100;i++){
            System.out.print(i+" ");
        }

        System.out.println();
        //9
        int odd=0,even=0;
        System.out.println("even");
        for(int i=1;i<=10;i++){
            if(i%2==0)
                System.out.print(i);;

        }
        System.out.println("odd");
        for(int i=1;i<=10;i++){
            if(i%2!=0)
                System.out.print(i);;

        }
        System.out.println();
        //10
         odd=0;even=0;
        for(int i=1;i<=10;i++){
            if(i%2==0)
            even+=i;
            else
                odd+=i;
        }
        System.out.print(odd+ " " + even);
        System.out.println();
        //11
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
        }

        System.out.println();
        //12
        for(int i=100;i>=1;i--){
            System.out.print(i+" ");
        }

        System.out.println();
        //13
        for(int i=30;i<=50;i++){
            System.out.print(i+" ");
        }

        System.out.println();
        //14
        for(int i=0;i<=25;i++){
            if(i%2==0)
            System.out.print(i+" ");
        }

        System.out.println();
        //15
        for(int i=0;i<=25;i++){
            if(i%2!=0)
                System.out.print(i+" ");
        }

        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("SERIES");
        System.out.println();
        System.out.println();

        // 1
        for(int i=2;i<=20;i++){
            if(i%2==0)
                System.out.print(i+" ");

        }
        System.out.println();
        //2
        for(int i=2;i<=90;i++){
            if(i%9==0)
                System.out.print(i+" ");
        }
        System.out.println();
        //3
        for(int i=1;i<=20;i++){
            if(i%2==0)
                System.out.print(-i+" ");
            else
                System.out.print(i+" ");
        }
        //4
        System.out.println();
        for(int i=2;i<=50;i++){
            if(i%5==0)
                System.out.print(i+" ");
        }
        //5
        System.out.println();
        for(int i=1;i<=1000;){
            System.out.print(i+" ");
            i=i*10;
        }
        System.out.println();
        //6
         sum=0;
        for(int i=1;i<10;i++){
            sum=sum+i;
            System.out.print(sum+" ");
        }
        System.out.println();
        //7
        for(int i=2;i<=80;i++){
            if(i%8==0)
                System.out.print(i+" ");
        }
        System.out.println();
        //8
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+ n2 +" ");
        for (int  i=2;i<9;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
        System.out.println();
        //9
        for(int i=1;i<=10;i++){
            int b= i*i;
            System.out.print(b+" ");
        }
        System.out.println();
        //10
        for(int i=2;i<=30;i++){
            if(i%3==0)
                System.out.print(i+" ");
        }
        System.out.println();
        //`11
        for(int i=2;i<=70;i++){
            if(i%7==0)
                System.out.print(i+" ");
        }
        System.out.println();
        //12
        for(int i=2;i<=40;i++){
            if(i%4==0)
                System.out.print(i+" ");
        }
        System.out.println();
        //13
        for(int i=2;i<=100;i++){
            if(i%10==0)
                System.out.print(i+" ");
        }
        System.out.println();
        //14
        int i=1;
        for(;i<5;i++){
            System.out.print(i+" ");
        }
        for(;i>0;i--) {
            System.out.print(i + " ");
        }
        i=0;
        System.out.println();
        //15
        for( i=2;i<=100;i++){
            if(i%6==0)
                System.out.print(i+" ");
        }
        System.out.println();
    }
}
