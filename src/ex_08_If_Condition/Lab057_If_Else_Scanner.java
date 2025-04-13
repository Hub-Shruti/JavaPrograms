package ex_08_If_Condition;

import java.util.Scanner;

public class Lab057_If_Else_Scanner {

    public static void main(String[] args) {

        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.


        // TAKE USER INPUT THROUGH SCANNER CLASS //

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = sc.nextInt();
        System.out.println(age);

        if (age > 18)
        {
            System.out.println("You are allowed to vote !");
        }
        else
        {
            System.out.println("You are not allowed to vote !");
        }

        sc.close();
    }
}
