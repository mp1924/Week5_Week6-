// Reverse number using array
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.err.println("Invalid input!");
            System.exit(0);
        }

        int temp = number;
        int count = 0;

        // Count digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        // Store digits
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display reverse
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}
