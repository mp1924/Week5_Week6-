// Store numbers until 0 or negative & find sum
import java.util.Scanner;

class SumUntilStop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxSize = 10;
        double[] numbers = new double[maxSize];

        int index = 0;
        double sum = 0;

        while (true) {

            if (index == maxSize) break;

            System.out.print("Enter number: ");
            double value = input.nextDouble();

            if (value <= 0) break;

            numbers[index] = value;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            sum += numbers[i];
        }

        System.out.println("Total Sum = " + sum);

        input.close();
    }
}
