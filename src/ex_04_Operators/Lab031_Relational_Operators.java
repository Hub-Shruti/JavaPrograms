package ex_04_Operators;

public class Lab031_Relational_Operators {

    public static void main(String[] args) {

        // RELATIONAL OPERATORS //
        // < (Less Than)
        // <= (Less than or equal to)
        // > (Greater Than)
        // >= (Greater than or equal to)
        // == (Equal to (compare two values))
        // != (Not equal to)

        // All of them will result in boolean output.

        int a = 10;
        int b = 20;
        boolean c = a<b;
        System.out.println(c);         // Output is true
        System.out.println(a <= b);    // Output is true
        System.out.println(a > b);     // Output is false
        System.out.println(a >= b);    // Output is false
        System.out.println(a == b);    // Output is false
        System.out.println(a != b);    // Output is true

        int age_1 = 35;
        int age_2 = 35;
        boolean result = age_1>=age_2;   // age_1 > age_2 or age_1 = age_2
        boolean res = age_1==age_2;
        boolean res1 = age_1!=age_2;
        System.out.println(result);      // Output is true
        System.out.println(res);         // Output is true
        System.out.println(res1);        // Output is false

        // BODMAS Rule
        System.out.println((9 * 3 / 9 + 1) * 3);        //Output is 12

        // 9 * 3 - 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4 * 3 -> 12

        // == (Compare the values)
        System.out.println( 10 == 10);        // Output is true
        System.out.println( 10 < 10);         // Output is false
        System.out.println( 10 == 20);        // Output is false
        System.out.println( 10 >= 10);        // Output is true

        System.out.println('A' == 65);        // Output is true since ASCII value of A is 65

    }
}
