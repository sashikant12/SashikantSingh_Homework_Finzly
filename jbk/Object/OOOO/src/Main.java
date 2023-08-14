public class Main {
    void show(String s){
        System.out.println(111);
    }
    void show(Object o){
        System.out.println(222);
    }
    public static void main(String[] args) {

        Main m = new Main();
        m.show( (Object) null);
        Object o = null;
        m.show(o);

    }
}