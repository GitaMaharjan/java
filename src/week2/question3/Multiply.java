package week2.question3;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        double value1 = scanner.nextDouble();

        System.out.print("Enter the second value: ");
        double value2 = scanner.nextDouble();

        System.out.print("Enter the third value: ");
        double value3 = scanner.nextDouble();

        double result = value1 * value2 * value3;

        System.out.println("The multiplication of "+ value1+", "+ value2+", "+"and "+ value3 +" is: " + result);

        scanner.close();
    }
}
