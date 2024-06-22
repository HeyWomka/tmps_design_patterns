package patterns.behavioral.strategy.example;

import java.util.Arrays;

public class StrategyPatternExample {
    public static void main(String[] args) {
        int[] data = {5, 1, 7, 3, 9, 2};

        SortContext context = new SortContext();

        // Use BubbleSort strategy
        context.setStrategy(new BubbleSortStrategy());
        context.performSort(data.clone());
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(data));

        // Use QuickSort strategy
        context.setStrategy(new QuickSortStrategy());
        context.performSort(data.clone());
        System.out.println("Sorted array using Quick Sort: " + Arrays.toString(data));
    }
}
