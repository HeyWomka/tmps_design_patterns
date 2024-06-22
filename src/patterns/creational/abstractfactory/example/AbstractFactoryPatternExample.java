package patterns.creational.abstractfactory.example;

import patterns.creational.abstractfactory.example.basic.Headphones;
import patterns.creational.abstractfactory.example.basic.Laptop;
import patterns.creational.abstractfactory.example.basic.Tablet;
import patterns.creational.abstractfactory.example.factory.BasicDeviceFactory;
import patterns.creational.abstractfactory.example.factory.ElectronicDeviceFactory;
import patterns.creational.abstractfactory.example.factory.HighEndDeviceFactory;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        // Create a High-End Device Factory
        ElectronicDeviceFactory highEndFactory = new HighEndDeviceFactory();

        Laptop gamingLaptop = highEndFactory.createLaptop();
        Tablet iOSTablet = highEndFactory.createTablet();
        Headphones wirelessHeadphones = highEndFactory.createHeadphones();

        gamingLaptop.compute();
        iOSTablet.navigate();
        wirelessHeadphones.listen();

        System.out.println();

        // Create a Basic Device Factory
        ElectronicDeviceFactory basicFactory = new BasicDeviceFactory();

        Laptop businessLaptop = basicFactory.createLaptop();
        Tablet androidTablet = basicFactory.createTablet();
        Headphones wiredHeadphones = basicFactory.createHeadphones();

        businessLaptop.compute();
        androidTablet.navigate();
        wiredHeadphones.listen();
    }
}
