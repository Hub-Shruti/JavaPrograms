package ex_09_Switch;

public class Lab065_Switch_NegativeICase {

    public static void main(String[] args) {

        int a = 11;

        switch (-1)
        {
            default:
                System.out.println("Default");
                break;
            case -1:                                // Output is 10
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
