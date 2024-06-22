package patterns.behavioral.templatemethod.example;

public abstract class Beverage {
    // Template method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        displayBeverageType();
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Hook method (optional step)
    protected void displayBeverageType() {
        System.out.println("Enjoy your " + getBeverageType());
    }

    // Abstract method to get the type of beverage
    protected abstract String getBeverageType();
}
