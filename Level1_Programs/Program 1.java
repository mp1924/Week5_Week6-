// Program to check voting eligibility of 10 students
import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalStudents = 10;
        int[] ages = new int[totalStudents];

        // Input ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            // Validation
            if (ages[i] < 0) {
                System.err.println("Invalid age entered!");
                System.exit(0);
            }
        }

        // Check eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote");
            }
        }

        input.close();
    }
}
