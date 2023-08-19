package Question1.me;

public class Cricle implements Shape {
    private double radius;

    public Cricle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*this.radius;
    }
}
