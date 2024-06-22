package patterns.creational.abstractfactory.example.basic;

public class WirelessHeadphones implements Headphones {
    @Override
    public void listen() {
        System.out.println("Using Wireless Headphones to listen.");
    }
}
