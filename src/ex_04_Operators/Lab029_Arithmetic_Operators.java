package ex_04_Operators;

public class Lab029_Arithmetic_Operators {

    public static void main(String[] args) {

        // ARITHMETIC OPERATORS //
        //        + (Addition)
        //       - (Subtraction)
        //       * (Multiplication)
        //       / (Division)
        //       % (Modulus) | Modulus - Remainder

        long a = 20l;      // 8 Byte, 64 Bits
        int b = 3;
        float c = 3f;      // or float c = 3.0f;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("axb = " + (a*b));
        System.out.println("a/b = " + (a/b));   // Output is 6 (int)
        System.out.println("a/c = " + (a/c));   // Output is 6.6666665 (float)
        System.out.println("a%b = " + (a%b));   // Output is 2 (Remainder)

        a = 20;
        b = 10;
        System.out.println("New value of a = " + a + "\nNew value of b = " + b + "\nNew value of a%b = " + (a%b));
        // Mod -> Remainder,
        //        10 | 20 |  2 - Quotient
        //           | 20 |
        //           -------
        //             0 - Remainder
        //           ----

        System.out.println("13%7 = " + (13%7));   //Output is 6

    }
}
