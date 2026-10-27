import java.util.Scanner;

public class StudentGrader {

    public static String calculateGrade(int score) {

        if (score < 0 || score > 100) {
            return "Invalid score! Score must be between 0 and 100.";
        }

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("STUDENT GRADER");

        while (true) {
            System.out.print("\nEnter student score (0-100) or -1 to exit: ");
            
            // Check if user input is an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid integer number.");
                scanner.next();
                continue;
            }

            int score = scanner.nextInt();

            if (score == -1) {
                System.out.println("Exiting Student Grader. Goodbye!");
                break;
            }

            String grade = calculateGrade(score);
            if (score >= 0 && score <= 100) {
                System.out.println("Score: " + score + " -> Grade: " + grade);
            } else {
                System.out.println(grade);
            }
        }

        scanner.close();
    }
}
