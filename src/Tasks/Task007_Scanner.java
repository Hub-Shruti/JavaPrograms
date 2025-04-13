package Tasks;

import java.util.Scanner;

public class Task007_Scanner {

    public static void main(String[] args) {

        // Scanner Class
        //
        //Take a user input - Name, Age and Salary and print them in the end.
        //

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for his/her name
        System.out.println("Enter your Name :");
        String name = scanner.nextLine();

        // Prompt the user for his/her age
        System.out.println("Enter your Age :");
        int age = scanner.nextInt();

        // Prompt the user for his/her salary
        System.out.println("Enter your Salary :");
        double salary = scanner.nextDouble();

        // Print the collected information
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // Close the scanner
        scanner.close();

    }
}
