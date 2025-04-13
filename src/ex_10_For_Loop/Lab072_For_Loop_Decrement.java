package ex_10_For_Loop;

public class Lab072_For_Loop_Decrement {

    public static void main(String[] args) {

        /*
        for (int i = 0; i < 0; i--)    // No output as Condition is not fulfilled.
        {
            System.out.println(i);
        }
        
        for (int i = 0; i < -10; i--)    // No output as Condition is not fulfilled
        {
            System.out.println(i);
        }
        
        for (int i = -1; i < -10; i--)    // No output as Condition is not fulfilled
        {
            System.out.println(i);
        }
         */

        int i = 10;          // Only Initialisation part can be done outside but Condition and Updation part should always be inside For Loop.
        for ( ; i > 0; i--)       // 10 to 1 (10 times)
        {
            System.out.println(i);
        }

    }
}
