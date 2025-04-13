package ex_05_Ternary_Operators;

public class Lab040_MaxOf2Numbers {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println("Maximum number is : " + max);
    }



}
