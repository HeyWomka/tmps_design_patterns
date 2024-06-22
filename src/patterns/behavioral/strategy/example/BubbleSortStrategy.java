package patterns.behavioral.strategy.example;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] data) {
        System.out.println("Sorting array using Bubble Sort");
        // Bubble sort algorithm
        int n = data.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (data[j] > data[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}
