package ex_07_TypeCasting;

public class Lab053_Widening_Narrowing_Implicit_Explicit {

    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;
//        int total = course+GST;           // Invalid - Implicit casting is not allowed in Narrowing
        int total1 = course+(int)GST;       // Valid - Narrowing - Explicit Casting
        System.out.println(total1);

        float total2 = course+GST;          // Widening - automatically allowed - Implicit Casting
        float total3 = (float)course+GST;   // Widening  - Explicit Casting (though not required)
        System.out.println(total2);
        System.out.println(total3);

    }
}
