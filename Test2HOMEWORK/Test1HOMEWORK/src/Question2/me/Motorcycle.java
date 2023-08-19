package Question2.me;

public class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Engine start");
    }

    @Override
    public void accelerate() {
        System.out.println("Its Accelerating now!!!");
    }

    @Override
    public void brake() {
        System.out.println("Break....");

    }
}
