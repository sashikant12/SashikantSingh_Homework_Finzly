package Question2.me;

public class Play {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.start();
        car.accelerate();
        car.brake();
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();
    }

}
