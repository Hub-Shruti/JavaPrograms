package ex_07_TypeCasting;

public class Lab052_Narrowing_ExplicitCasting {

    public static void main(String[] args) {

        int val  = 300;
        //byte b = val;        // Invalid - Implicit Casting is not allowed in Narrowing
        byte b2 = (byte)val;   // Valid - Explicit Casting is allowed in Narrowing

        // Data Loss occurs in Narrowing //

        System.out.println(val);
        System.out.println(b2);

        long phone_no = 9876543210l;
        //short s = phone_no;          // Invalid as Implicit Casting is not allowed in Narrowing
        short s = (short) phone_no;    // Valid - Explicit Casting - Narrowing

        System.out.println(phone_no);
        System.out.println(s);

    }
}
