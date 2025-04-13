package ex_05_Ternary_Operators;

public class Lab038_Ternary_Operator {

    public static void main(String[] args) {

        // ? :
        // result = condition ? expression1 : expression2;
        int age = 10;
        String canIVote  =  10 >=18 ? "Yes, You can Vote" : "No You can't Vote";
        System.out.println(canIVote);

        int number = -5;
        String result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);

    }
}
