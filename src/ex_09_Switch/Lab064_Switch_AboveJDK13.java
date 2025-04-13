package ex_09_Switch;

public class Lab064_Switch_AboveJDK13 {

    public static void main(String[] args) {

        // in JDK > 13
        int itemCode = 001;
        switch (itemCode)
        {
            case 001 -> System.out.println("001");       // -> is allowed in JDK>13 and no break is required
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }

        int code = 006;

        switch (code)
        {
            case 001, 002, 005:                     // Multiple cases in one line is allowed in JDK>13
                System.out.println("Electronic");
                break;
            case 004, 006, 007:
                System.out.println("Mechanical");
                break;
            default:
                System.out.println("None");
        }

    }
}
