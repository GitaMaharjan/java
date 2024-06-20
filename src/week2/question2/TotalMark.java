package week2.question2;

import java.util.Scanner;

public class TotalMark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] marks = new double[4];
        double total = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            total += marks[i];
        }

        System.out.println("The total of the 4 marks is: " + total);

        scanner.close();
    }
}
