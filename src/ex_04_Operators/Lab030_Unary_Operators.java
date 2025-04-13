package ex_04_Operators;

public class Lab030_Unary_Operators {

    public static void main(String[] args) {

        // UNARY OPERATORS //
        //+ (Unary plus)
        //- (Unary minus)
        //++ (Increment)
        //-- (Decrement)
        //! (Logical NOT)
        //~ (Bitwise complement)

        // + (Unary plus) AND - (Unary minus)
        int a = +10;
        int a1 = -110;
        int a2 = +a;
        int a3 = -a1;
        int result = a+a1;
        System.out.println(a);    // Output is 10
        System.out.println(a1);   // Output is -110
        System.out.println(a2);   // Output is 10
        System.out.println(a3);   // Output is 110
        System.out.println(result);  // Output is -100

        int b = -1;
        b = b+1;
        System.out.println(b);   // Output is 0

        //++ (Pre and Post Increment) AND -- (Pre and Post Decrement)

        System.out.println(a++);    // Output is 10
        System.out.println(a1--);   // Output is -110
        System.out.println(a++ + a1--);  //Output is -100 [11 + (-111) = -100]

        System.out.println(++a);   // Output is 13
        System.out.println(--a1);   // Output is -113
        System.out.println(++a + --a1);  // Output is [14 + (-114) = -100]


        //! (Logical NOT)
        boolean v = true;
        System.out.println(!v);     // Output is false

        //~ (Bitwise complement)
        int v1 = 5;
        int v2 = ~v1;
        //The tilde operator ~ is a bitwise NOT operator.
        // Bitwise NOT inverts all the bits of a number.
        // In two's complement representation, ~ x = -(x+1).
        System.out.println(v2);   // Output is -(5+1) = -6

    }
}
