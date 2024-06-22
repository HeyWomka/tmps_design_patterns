package patterns.creational.abstractfactory.example.basic;

public class AndroidTablet implements Tablet {
    @Override
    public void navigate() {
        System.out.println("Android Tablet is navigating.");
    }
}