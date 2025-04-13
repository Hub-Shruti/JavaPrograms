package ex_05_Ternary_Operators;

public class Lab043_Age_Classification {

    public static void main(String[] args) {

       //  Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)


        //  TAKE INPUT FROM USER //

        String age1 = args [0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);

    }
}
