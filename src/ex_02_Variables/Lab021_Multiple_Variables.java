package ex_02_Variables;

public class Lab021_Multiple_Variables {

    public static void main(String[] args) {


        // PRIMITIVE DATA TYPES //

        // Numeric Types - Integral types, Floating-Point types

        // Integral Data Types
        byte a = 10, b = 20, c = 30;
        //  byte Byte = 128;   //  This is not valid variable_value
        //  as byte (8 bits) can only store values from -128 to max 127 value
        short d = 100, e = 200, f = 300;
        int g = 1234, h = 12345, i = 123456;
        char j = 'A', k = 'a', l = '_', m = '$';    // char stores single character
        long n = 01234l, o = 56789L;   // Both l and L are allowed after long variable_value

        // Floating-Point Data Types
        float p = 12345.12345f, q = 987.98765F;       // Decimal value which displays max 8 digits with round-off
                                                      // Both f and F are allowed after float variable_value
        double r = 12345.12345, s = 98765.98765;      // Precise value

        // Boolean Types
        // Boolean Data Types
        boolean t = true, u = false;


        System.out.println("Byte Values : "+ a + "," + b + "," + c);
        System.out.println("Short Values : "+ d + "," + e + "," + f);
        System.out.println("Integer Values : "+ g + "," + h + "," + i);
        System.out.println("Character Values : "+ j + "," + k + "," + l + "," + m);
        System.out.println("Long Values : "+ n + "," + o);
        System.out.println("Float Values : "+ p + "," + q);
        System.out.println("Double Values : "+ r + "," + s);
        System.out.println("Boolean Values : "+ t + "," + u);

    }
}
