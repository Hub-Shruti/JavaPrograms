
package ex_05_Ternary_Operators;

import java.util.Scanner;

public class Lab042_MaxOf3Numbers {

    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 9;
        int num3 = -11;

        // num1 > num2 and num1  > num3 -> num1
        // num2 > num3 and num2>  num1 ->  num2
        // num3

        int max = (num1 > num2) ? (num1 > num3) ? num1 : num3 : ((num2 > num3) ? num2 : num3);
        System.out.println("Maximum number is : " + max);


        //  TAKE INPUT FROM USER  //

        // INPUT THROUGH CONSOLE //

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide three numbers : ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

     /*

        //  INPUT THROUGH COMMAND LINE ARGUMENTS (EDIT CONFIGURATION AND THEN RUN) //

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

     */

       if (n1>n2 & n1>n3) {
            System.out.println(n1 + " is Max");
        }
       else if (n2>n1 & n2>n3)
    {
            System.out.println(n2 + " is Max");
        }
       else
       {
            System.out.println(n3 + " is Max");
        }
    }

}
