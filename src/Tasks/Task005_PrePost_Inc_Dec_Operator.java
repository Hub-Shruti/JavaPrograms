package Tasks;

public class Task005_PrePost_Inc_Dec_Operator {

    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--);      // 58
        System.out.println(a);

        // --a -> A -> ExpA -> 19 , a -> 19
        // +
        // a++ -> B -> ExpB -> 19 , a -> 20
        // +
        // a-- -> C -> ExpC -> 20, a -> 19
        // A+B+C -> ExpA+ExpB+ExpC -> 19+19+20 -> 58 , a -> 19

    }
}
