package ex_05_Ternary_Operators;

public class Lab039_Nested_Ternary_Operator {

    public static void main(String[] args) {

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        //                    OR
        // result = condition1 ? (condition2 ? expression1 : expression2) : expression3;

        int num = 25;
        String result = (num>10) ? (num>20 ? "Number > 20" : "Number < 20") : "Number < 10";
        System.out.println(result);

        int n = -5;
        String result1 = (n>10) ? (n>20 ? "Number > 20" : "Number < 20") : "Number < 10";
        System.out.println(result1);

    }
}
