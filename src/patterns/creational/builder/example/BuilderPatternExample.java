package patterns.creational.builder.example;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels("Alloy Wheels")
                .setBody("SUV")
                .setInterior("Leather")
                .setPaint("Red")
                .build();

        System.out.println("BUILT CAR: " + car);
    }
}
