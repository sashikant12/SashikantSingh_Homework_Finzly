package Question1.me;

public class Triangle implements Shape{
    private int side1,side2,side3;

    public Triangle(int side1, int side2, int side3) {
       this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    double d = calculatePerimeter()/2;
    @Override
    public double calculateArea() {
        System.out.println(d);
//        double d = calculatePerimeter()/2;
        return Math.sqrt(d*(d-side1)*(d-side2)*(d-side3));
    }

    @Override
    public double calculatePerimeter() {
        return side2+side3+side1;
    }
}
