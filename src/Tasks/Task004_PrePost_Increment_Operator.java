package Tasks;

public class Task004_PrePost_Increment_Operator {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + a++ + a++);     // 34
        System.out.println(a);     // 13


        // ++a -> A -> ExpA -> 11 , a ->  11
        // +
        // a++ -> B -> ExpB -> 11 , a -> 12
        // +
        // a++ -> C -> ExpC -> 12, a -> 13
        // A+B+C -> ExpA+ExpB+ExpC -> 11+11+12 -> 34 , a -> 13

    }
}
