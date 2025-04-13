package ex_04_Operators;

public class Lab037_InstanceOf_Operator {

    public static void main(String[] args) {

        // new Operator

        String s1 = new String ("Java");
        String s2= "Name";       //  8 Byte, 64 Bits

        System.out.println(s1);
        System.out.println(s2);

        // instanceof Operator

        System.out.println(s1 instanceof String);      //Output is true
        System.out.println(s2 instanceof String);      //Output is true
    }
}
