package Area;

import java.util.Scanner;

public class InputValidator {
    private static Scanner scanner = new Scanner(System.in);

    public static double getPositiveInput(String prompt) {
        double number;
        do {
            System.out.println(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid number:");
                scanner.next(); 
            }
            number = scanner.nextDouble();
            if (number <= 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (number <= 0);
        return number;
    }
}
