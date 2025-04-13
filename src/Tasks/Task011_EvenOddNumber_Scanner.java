package Tasks;

import java.util.Scanner;

public class Task011_EvenOddNumber_Scanner {

    public static void main(String[] args) {

        //Create a Program -
        // Take user input &
        // Check weather the input is Even or Odd number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if (num%2==0)
        {
            System.out.println( num +" is an Even Number");
        }
        else
        {
            System.out.println( num +" is an Odd Number");
        }

        sc.close();
    }
}
