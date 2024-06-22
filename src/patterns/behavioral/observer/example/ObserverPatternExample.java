package patterns.behavioral.observer.example;

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayDevice phoneDisplay = new DisplayDevice("Phone Display");
        DisplayDevice laptopDisplay = new DisplayDevice("Laptop Display");

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(laptopDisplay);

        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(27.3f);

        weatherStation.removeObserver(phoneDisplay);
        weatherStation.setTemperature(30.2f);
    }
}
