package patterns.creational.factorymethod.example;

public class Motorcycle implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Motorcycle is being manufactured.");
    }
}
