import java.util.Scanner;

class program9{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();
        char grade;
        String status;

        if (score >= 90) {
            grade = 'A';
            status = "passed";
        } else if (score >= 80) {
            grade = 'B';
            status = "passed";
        } else if (score >= 70) {
            grade = 'C';
            status = "passed";
        } else if (score >= 60) {
            grade = 'D';
            status = "passed";
        } else if (score >= 50) {
            grade = 'E';
            status = "passed";
        } else {
            grade = 'F';
            status = "failed";
        }

        System.out.println("The student has " + status + " with a grade of " + grade + ".");

        scanner.close();
    }
}
