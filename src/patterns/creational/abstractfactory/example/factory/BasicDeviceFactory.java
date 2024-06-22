package patterns.creational.abstractfactory.example.factory;

import patterns.creational.abstractfactory.example.basic.*;

public class BasicDeviceFactory implements ElectronicDeviceFactory {
    @Override
    public Laptop createLaptop() {
        return new BusinessLaptop();
    }

    @Override
    public Tablet createTablet() {
        return new AndroidTablet();
    }

    @Override
    public Headphones createHeadphones() {
        return new WiredHeadphones();
    }
}
