package patterns.creational.abstractfactory.example.basic;

public class WiredHeadphones implements Headphones {
    @Override
    public void listen() {
        System.out.println("Using Wired Headphones to listen.");
    }
}
