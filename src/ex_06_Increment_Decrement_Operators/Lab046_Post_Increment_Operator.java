package ex_06_Increment_Decrement_Operators;

public class Lab046_Post_Increment_Operator {

    public static void main(String[] args) {

        // POST increment  = Print first and then increase

        int a_post = 10;
        System.out.println(a_post++);    // 10 (Print) then a= 11
        System.out.println(a_post);      // 11


        int a = 10;
        int result = a++;
        System.out.println(a);        // 11
        System.out.println(result);   // 10

        // Line No. |  a | Exp (result)
        //  14 |  10 | NA
        //  15 |  11 | 10
        //  16 |  11 | NA
        //  17 | NA | 10

        int c = 10;
        System.out.println(c++ + c);     // 21
        // A + B
        // A -> c++ -> ExpA -> 10, c = 11
        // +
        // B -> c -> ExpB -> 11 , c = 11
        // A+B ->  ExpA + ExpB -> 10+11 = 21

        // Line No. |  c |  Exp
        // 25 | 10 | NA |
        // 26 | 11 | 10+11 -> 21

    }
}
