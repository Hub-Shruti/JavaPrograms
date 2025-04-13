package ex_10_For_Loop;

public class Lab076_For_Loop_Continue_EvenNumbers {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++)
        {
            if ( i % 2 == 0)
            {
                System.out.println("Even -> "+ i);
                continue;
            }

            System.out.println("Odd -> "+ i);
        }

    }
}
