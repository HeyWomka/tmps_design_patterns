package patterns.behavioral.strategy.example;

public class SortContext {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void performSort(int[] data) {
        strategy.sort(data);
    }
}
