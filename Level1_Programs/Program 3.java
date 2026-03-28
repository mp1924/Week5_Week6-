// Multiplication table using array
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid input!");
            System.exit(0);
        }

        int size = 10;
        int[] table = new int[size];

        // Store values
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}
