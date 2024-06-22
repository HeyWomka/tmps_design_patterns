package patterns.structural.facade.example;

public class TV {
    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void setInputChannel() {
        System.out.println("TV channel set to DVD");
    }
}
