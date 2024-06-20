package week3.question1;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        String grade;
        if (total >= 85 && total <= 100) {
            grade = "High Distinction";
        } else if (total >= 75 && total <= 84) {
            grade = "Distinction";
        } else if (total >= 65 && total <= 74) {
            grade = "Credit";
        } else if (total >= 50 && total <= 64) {
            grade = "Pass";
        } else if (total >= 0 && total <= 49) {
            grade = "Fail";
        } else {
            grade = "Invalid marks";
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
