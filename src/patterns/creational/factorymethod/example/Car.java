package patterns.creational.factorymethod.example;

public class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Car is being manufactured.");
    }
}
