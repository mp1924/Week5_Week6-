// Frequency of digits in a number
import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.err.println("Invalid input!");
            System.exit(0);
        }

        int[] frequency = new int[10];

        // Count frequency
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Display
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        input.close();
    }
}
