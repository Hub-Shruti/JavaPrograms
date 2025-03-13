package ex_02_Variables;

public class Lab019_printf {

    public static void main(String[] args) {

        int a = 10;

        System.out.printf("Your integer variable is %d",a);
        // %d -> int, byte, long, short data types
        // %s -> String data types
        // %f -> float, double data types
        // %b -> boolean data types

        int b = 20;
        float c = 11.998877F;
        System.out.println();
        System.out.printf("Your integer variable is %d",b);
        System.out.println();
        System.out.printf(a + " + " + b);
        System.out.println();
        System.out.println("-----");
        System.out.printf("%d + %d",a,b);
        System.out.println();
        System.out.printf("Your float variable is %f",c);

    }
}
