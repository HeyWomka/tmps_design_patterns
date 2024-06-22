package patterns.creational.builder.example;

public class Car {
    private String engine;
    private String wheels;
    private String body;
    private String interior;
    private String paint;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.body = builder.body;
        this.interior = builder.interior;
        this.paint = builder.paint;
    }

    // Getters (Optional)
    public String getEngine() { return engine; }
    public String getWheels() { return wheels; }
    public String getBody() { return body; }
    public String getInterior() { return interior; }
    public String getPaint() { return paint; }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", body=" + body + 
               ", interior=" + interior + ", paint=" + paint + "]";
    }

    public static class CarBuilder {
        private String engine;
        private String wheels;
        private String body;
        private String interior;
        private String paint;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public CarBuilder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public CarBuilder setPaint(String paint) {
            this.paint = paint;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
