import java.util.*;
class program13 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks for subject 1:");
        int mark1 = in.nextInt();
        System.out.println("Enter marks for subject 2:");
        int mark2 = in.nextInt();
        System.out.println("Enter marks for subject 3:");
        int mark3 = in.nextInt();
        System.out.println("Enter marks for subject 4:");
        int mark4 = in.nextInt();
        System.out.println("Enter marks for subject 5:");
        int mark5 = in.nextInt();
        int totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = (double) totalMarks / 5;
        char grade;
        String status;
        if (average >= 90) {
            grade = 'A';
            status = "passed";
        } else if (average >= 80) {
            grade = 'B';
            status = "passed";
        } else if (average >= 70) {
            grade = 'C';
            status = "passed";
        } else if (average >= 60) {
            grade = 'D';
            status = "passed";
        } else if (average >= 50) {
            grade = 'E';
            status = "passed";
        }else{
            grade = 'F';
            status = "failed";
        }
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
        in.close();
    }
}
