import java.util.Random;

public class Sorting {

    private int[] array; // Instance variable to hold the array

    // Constructor
    public Sorting(int size) {
        array = new int[size]; // Initialize the array with the given size
        fillArrayWithRandomNumbers(); // Populate the array with random integers

        System.out.println("Original Array:");
        printArray();

        // Sort the array
        bubbleSort();

        System.out.println("Sorted Array:");
        printArray();
    }

    // Method to fill the array with random integers
    private void fillArrayWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Random numbers between 0 and 99
        }
    }

    // Method to print the array
    public void printArray() {

        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public void selectionSort() {
        for (int n = 0; n < array.length - 1; n++) {
            int minIndex = n;
            for (int i = n; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = array[n];
            array[n] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }


    }
    // Main method
    public static void main(String[] args) {
        Sorting sorter = new Sorting(10);

    }
}