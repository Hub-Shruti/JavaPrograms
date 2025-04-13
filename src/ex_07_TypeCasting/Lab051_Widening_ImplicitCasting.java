package ex_07_TypeCasting;

public class Lab051_Widening_ImplicitCasting {

    public static void main(String[] args) {

        byte b = 10;
        int a = b;     // Valid syntax -> Implicit Casting- Automatically (smaller data into the bigger data type)
                       // Implicit Casting is allowed in Widening

        int a1 = (int)b;    // Explicit Casting is not required in Widening

        System.out.println(b);
        System.out.println(a);

    }
}
