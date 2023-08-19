package Question1.me;

public class Rectangle implements  Shape{
    private int length,breadth;

    public Rectangle(int length, int breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+breadth);
    }
}
