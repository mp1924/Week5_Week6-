// Program: Find largest and second largest number in an array
// Description: Uses array concepts and validation

import java.util.Scanner;

class LargestSecondLargest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size;

        // Input size
        System.out.print("Enter number of elements: ");
        size = input.nextInt();

        if (size < 2) {
            System.err.println("Array must have at least 2 elements!");
            System.exit(0);
        }

        int[] numbers = new int[size];

        // Input elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int largest = numbers[0];
        int secondLargest = numbers[0];

        // Find largest and second largest
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);

        input.close();
    }
}
