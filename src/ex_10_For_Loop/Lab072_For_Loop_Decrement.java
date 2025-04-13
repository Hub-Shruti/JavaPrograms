package ex_10_For_Loop;

public class Lab072_For_Loop_Decrement {

    public static void main(String[] args) {

        /*
        for (int i = -1; i < -10 ; i--)    // Invalid (Not allowed)
        {
            System.out.println(i);
        }

         */

        int i = 10;
        for ( ; i > 0; i--)         // 10 to 1 (10 times)
        {
            System.out.println(i);
        }

    }
}
