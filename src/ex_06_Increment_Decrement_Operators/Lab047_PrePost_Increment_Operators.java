package ex_06_Increment_Decrement_Operators;

public class Lab047_PrePost_Increment_Operators {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a++ + ++a);      // 22
        System.out.println(a);              // 12

        // a++ -> A -> ExpA -> 10 , a ->  11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
        // A+B -> ExpA+ExpB -> 10+12 -> 22 , a -> 12

        int b = 10;
        System.out.println(++b + ++b);     // 23
        System.out.println(b);             // 12

        // ++b -> A -> ExpA -> 11 , b -> 11
        // +
        // ++b -> B -> ExpB -> 12 , b -> 12
        // ExpA + ExpB -> 11+12 -> 23, b -> 12

    }
}
