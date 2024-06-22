package patterns.behavioral.templatemethod.example;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected String getBeverageType() {
        return "Tea";
    }
}
