package ex_03_Literals;

public class Lab022_Integer_Literals {

    public static void main(String[] args) {

        /*
        Literals are the actual values assigned.
        Literals can be Numeric and Non-Numeric.
         */

        int age = 65;     // 65 is a literal
        age = 66;

        int Enum = 89;    // This is allowed as Enum is not a keyword (only lowercase enum is a keyword)

        final int girl_age = 18;
        // girl_age = 19;     // This is not allowed due to final constant

        System.out.println(age);
        System.out.println(Enum);
        System.out.println(girl_age);

    }
}
