package patterns.creational.abstractfactory.example.factory;

import patterns.creational.abstractfactory.example.basic.Headphones;
import patterns.creational.abstractfactory.example.basic.Laptop;
import patterns.creational.abstractfactory.example.basic.Tablet;

public interface ElectronicDeviceFactory {
    Laptop createLaptop();
    Tablet createTablet();
    Headphones createHeadphones();
}
