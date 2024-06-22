package patterns.creational.abstractfactory.example.basic;

public class BusinessLaptop implements Laptop {
    @Override
    public void compute() {
        System.out.println("Business Laptop is computing.");
    }
}
