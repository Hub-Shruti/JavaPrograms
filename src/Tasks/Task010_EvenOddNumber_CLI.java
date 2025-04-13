package Tasks;

public class Task010_EvenOddNumber_CLI {

    public static void main(String[] args) {

        //Create a Program -
        // Take user input &
        // Check weather the input is Even or Odd number

        System.out.println("Enter the number :");
        int num = Integer.parseInt(args[0]);

        if (num%2==0)
        {
            System.out.println("Even number");
        }

        else
        {
            System.out.println("Odd number");
        }
    }
}
