package ex_09_Switch;

import java.util.Scanner;

public class Lab059_Switch_without_Break {

    public static void main(String[] args) {

        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> Monday to Sunday
        // All other numbers -> Invalid

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7)");
        int day = sc.nextInt();

        switch (day)
        {
            case 1 :
                System.out.println("Monday");
            case 2 :
                System.out.println("Tuesday");
            case 3 :
                System.out.println("Wednesday");
            case 4 :
                System.out.println("Thursday");
            case 5 :
                System.out.println("Friday");
            case 6 :
                System.out.println("Saturday");
            case 7 :
                System.out.println("Sunday");
            default :
                System.out.println("Invalid day number !");
        }
        sc.close();
    }
}
