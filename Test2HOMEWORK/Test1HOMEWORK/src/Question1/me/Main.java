package Question1.me;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Cricle cricle = new Cricle(10);
        Rectangle rectangle = new Rectangle(10,10);
        Triangle triangle = new Triangle(10,10,10);
        shapes.add(cricle);
        shapes.add(rectangle);
        shapes.add(triangle);
        for (Shape s:shapes) {
            System.out.println("Area of "+ s.getClass().getSimpleName()+": "+s.calculateArea());
            System.out.println("Perimeter of "+ s.getClass().getSimpleName()+":  "+s.calculatePerimeter());
        }
    }
}
