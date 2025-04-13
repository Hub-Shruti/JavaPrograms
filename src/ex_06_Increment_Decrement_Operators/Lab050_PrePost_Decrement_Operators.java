package ex_06_Increment_Decrement_Operators;

public class Lab050_PrePost_Decrement_Operators {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a-- - --a);    // 2
        System.out.println(a);            // 8

        // a-- -> A -> ExpA -> 10 , a ->  9
        // -
        // --a -> B -> ExpB -> 8 , a -> 8
        // A-B -> ExpA-ExpB -> 10-8 -> 2 , a -> 8

        int b = 10;
        System.out.println(--b - --b);     // 1
        System.out.println(b);             // 8

        // --b -> A -> ExpA -> 9 , b -> 9
        // -
        // --b -> B -> ExpB -> 8 , b -> 8
        // ExpA - ExpB -> 9-8 -> 1, b -> 8

    }
}
