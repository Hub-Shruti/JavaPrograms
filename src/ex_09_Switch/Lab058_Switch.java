package ex_09_Switch;

public class Lab058_Switch {

    public static void main(String[] args) {

        // Switch

        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> Monday to Sunday
        // All other numbers -> Invalid

        System.out.println("Enter the day number (1 to 7)");
        int day = Integer.parseInt(args[0]);

        switch (day)
        {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid day number !");
        }

    }
}
