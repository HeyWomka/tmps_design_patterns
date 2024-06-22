package patterns.creational.abstractfactory.example.basic;

public class iOSTablet implements Tablet {
    @Override
    public void navigate() {
        System.out.println("iOS Tablet is navigating.");
    }
}
