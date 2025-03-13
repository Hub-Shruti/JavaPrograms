package ex_02_Variables;

public class Lab020_Constants {

    public static void main(String[] args) {

        final int a = 10;
        // a = 12;     //    a = 12; not possible to change the value

        final float PI = 3.14f;
        // PI = 90;     // final constant doesn't allow to change variable value

        System.out.println(a);
        System.out.println(PI);
    }
}
