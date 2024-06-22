package patterns.structural.facade.example;

public class DVDPlayer {
    public void on() {
        System.out.println("DVDPlayer is on");
    }

    public void off() {
        System.out.println("DVDPlayer is off");
    }

    public void play() {
        System.out.println("DVDPlayer is playing");
    }

    public void stop() {
        System.out.println("DVDPlayer is stopped");
    }
}
