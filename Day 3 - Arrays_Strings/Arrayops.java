public class Arrayops {
    public static void main(String[] args) {
        // Initialization
        int[] numbers = {12, 5, 8, 25, 3};
        
        // Array Traversal
        System.out.println("--- 1. Array Traversal (Printing) ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Sum & Average Calculation
        System.out.println("\n--- 2. Basic Calculations ---");
        int totalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];
        }
        double average = (double) totalSum / numbers.length;
        System.out.println("Sum of all elements: " + totalSum);
        System.out.println("Average of elements: " + average);

        // Linear Search
        System.out.println("\n--- 4. Searching ---");
        int target = 25;
        int foundAt = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundAt = i;
                break;
            }
        }
        if (foundAt != -1) {
            System.out.println("Target " + target + " found at index: " + foundAt);
        } else {
            System.out.println("Target " + target + " was not found in the array.");
        }
    }
}