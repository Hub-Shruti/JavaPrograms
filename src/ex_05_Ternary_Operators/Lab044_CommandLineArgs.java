package ex_05_Ternary_Operators;

public class Lab044_CommandLineArgs {

    public static void main(String[] args) {

        //  TAKE INPUTS  //
        String age_string = args[0];
        String a1 = args[1];
        String a2 = args[2];
        String a3 = args[3];
        String a4 = args[4];    // java.lang.ArrayIndexOutOfBoundsException
        int age = Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

    }
}
