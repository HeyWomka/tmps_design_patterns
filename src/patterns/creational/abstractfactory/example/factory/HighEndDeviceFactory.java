package patterns.creational.abstractfactory.example.factory;

import patterns.creational.abstractfactory.example.basic.*;

public class HighEndDeviceFactory implements ElectronicDeviceFactory {
    @Override
    public Laptop createLaptop() {
        return new GamingLaptop();
    }

    @Override
    public Tablet createTablet() {
        return new iOSTablet();
    }

    @Override
    public Headphones createHeadphones() {
        return new WirelessHeadphones();
    }
}
