package ex_10_For_Loop;

public class Lab067_For_Loop {

    public static void main(String[] args)
    {
        // For Loop
        // Help you to repeat a block of code.

        // Initialization -> Condition -> Updation (Increment/Decrement)
        // ICU

        // for ( I ; C ; U )
        for (int i = 0; i < 10; i++)       // No Output is displayed
        {

        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);        // 0,1,2......9 - times it got executed - 10 times ( 0 to 9)
        }

        System.out.println("End");

        for (int aditi = 0; aditi < 10; aditi++)
        {
            System.out.println(aditi);        // 0,1,2......9 - times it got executed - 10 times ( 0 to 9)
        }


        System.out.println("End");

        for (int _1 = 0; _1 <= 10; _1++) { // 11 times
            System.out.println(_1); // 0, to 10
        }
        System.out.println("End");
    }
}
