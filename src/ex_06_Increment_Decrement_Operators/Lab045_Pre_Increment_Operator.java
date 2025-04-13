package ex_06_Increment_Decrement_Operators;

public class Lab045_Pre_Increment_Operator {

    public static void main(String[] args) {

        // PRE Increment  = Increase first and then Print

        int a = 10;
        int b = ++a;         // 10+1 -> b -> 11
        System.out.println(b);     // 11
        System.out.println(a);     // 11

        //  Exp and Result Table
        // Line No | a | Result b
        // 8 | 10 | NA
        // 9 | 11 | 11
        // 10 | 11(NA) | 11
        // 11 | 11 | 11(NA)

        System.out.println(++a);    // 12
        System.out.println(a);      // 12

        int c = 10;
        int result = ++c;
        System.out.println(c);         // 11
        System.out.println(result);    // 11

        // Line No. |   c | Exp(result)
        //  24   | 10 | NA
        // 25 | 11 | 11
        // 26 | 11 | 11 (NA)
        // 27 | 11 (NA) | 11


    }
}
