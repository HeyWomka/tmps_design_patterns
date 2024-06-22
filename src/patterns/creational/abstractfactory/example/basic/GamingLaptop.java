package patterns.creational.abstractfactory.example.basic;

public class GamingLaptop implements Laptop {
    @Override
    public void compute() {
        System.out.println("Gaming Laptop is computing.");
    }
}
