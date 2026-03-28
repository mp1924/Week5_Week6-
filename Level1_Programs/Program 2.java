// Program to classify numbers
import java.util.Scanner;

class NumberAnalysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = 5;
        int[] numbers = new int[size];

        // Input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Analysis
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " is Positive and ");

                if (numbers[i] % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");

            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }

        // Compare first and last
        if (numbers[0] > numbers[size - 1])
            System.out.println("First element is greater");
        else if (numbers[0] < numbers[size - 1])
            System.out.println("Last element is greater");
        else
            System.out.println("Both are equal");

        input.close();
    }
}
