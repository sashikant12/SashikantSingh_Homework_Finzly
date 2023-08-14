package Contructor.com;

public class ConsOverloading {
    int v1,v2;

     public ConsOverloading() {
        v1=10;
        v2=20;
        System.out.println("in 1");
    }
    ConsOverloading(int a){
         v1=a;
        System.out.println("in 2");
//        new ConsOverloading();
    }
    ConsOverloading(int a,int b){
         v1=a;
         v2=b;
        System.out.println("in 3");
    }
    void d(){
        System.out.println("Value1= "+ v1);
        System.out.println("Value2= "+ v2);
    }

    public static void main(String[] args) {
        ConsOverloading d = new ConsOverloading();
        d.d();
        ConsOverloading d1 = new ConsOverloading(30);
        d1.d();
        ConsOverloading d2 = new ConsOverloading(20,12);
        d2.d();
    }
}
