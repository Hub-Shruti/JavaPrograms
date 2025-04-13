package ex_10_For_Loop;

public class Lab075_For_Loop_Continue {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++)             // 0 to 49, 50 times
        {
            if (i == 5) {
                continue;                        // Skip below code, Move to top
            }
            System.out.println(i);
        }
    }
}
