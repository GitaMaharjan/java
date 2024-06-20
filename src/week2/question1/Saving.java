package week2.question1;
import java.util.Scanner;

public class Saving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your pay: ");
        double pay = scanner.nextDouble();

        double saving = pay * 0.10;

        System.out.println("Your saving (10% of your pay) is: " + saving);

        scanner.close();
    }
}


