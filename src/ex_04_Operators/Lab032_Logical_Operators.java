package ex_04_Operators;

public class Lab032_Logical_Operators {

    public static void main(String[] args) {

        // LOGICAL OPERATORS //
        // ! (Logical NOT)
        // && (Logical AND)
        // || (Logical OR)

        boolean a = true;
        System.out.println(!a);      // Output is false
        boolean b = true;
        System.out.println(!!b);     // Output is true

        System.out.println(!(10>20));    // Output is true

        boolean c = true || false;
        System.out.println(c);        // Output is true

        boolean d = true && false;
        System.out.println(d);          // Output is false

        // || (OR)  // Only false || false returns false
        //   T || T -> T
        //   T || F -> T
        //   F || T -> T
        //   F || F -> F

        System.out.println(true || true);        // Output is true
        System.out.println(true || false);       // Output is true
        System.out.println(false || true);       // Output is true
        System.out.println(false || false);      // Output is false

        //  && (AND)  // Only true && true returns true
        //   T || T -> T
        //   T || F -> F
        //   F || T -> F
        //   F || F -> F

        System.out.println(true && true);        // Output is true
        System.out.println(true && false);       // Output is false
        System.out.println(false && true);       // Output is false
        System.out.println(false && false);      // Output is false


        int balaji_salary = 12;
        boolean result = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(result);      // Output is false

        // A - balaji_salary > 10    (12 > 10 -> true)
        // B -> balaji_salary < 5    (12 < 5 -> false)
        // !(A || B)      [ !(true || false) -> !true -> false ]

    }
}
