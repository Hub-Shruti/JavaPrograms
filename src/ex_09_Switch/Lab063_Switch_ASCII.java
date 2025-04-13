package ex_09_Switch;

public class Lab063_Switch_ASCII {

    public static void main(String[] args) {

        char ch = 'A';
        switch (ch)
        {
            case 65:
                System.out.println("ASCII Match");      // This is Output since ASCII code of 'A' is 65 //
                break;
            default:
                System.out.println("No Match");
        }
    }
}
