package ex_04_Operators;

public class Lab033_Concatenation_Operator {

    public static void main(String[] args) {

        // + -> behave differently with the data type.
        // + -> operator overloading

        int a = 40;
        int b = 50;
        System.out.println(a + b);  // Mathematical operation    // Output is 90

        String name1 = "Java";
        String name2 = "Language";
        System.out.println(name1+name2);   // Combine both the strings  // Output is JavaLanguage

        String first_name = "Hello";
        String last_name = "World";

        a = 10;
        b = 10;

        System.out.println(first_name + last_name + a + b);
        // Output is HelloWorld1010 -> first variable (string) -> first operator -> + performed as Concatenation

        System.out.println(a + b + first_name + last_name);
        // Output is 20HelloWorld -> first variable (int) -> first operator (Mathematical operation) -> + performed as Concatenation for Strings

        System.out.println(first_name + last_name + (a + b));
        // Output is HelloWorld20 -> Brackets are used

        // BODMAS Rule is followed - Brackets, Order of Powers, Division, Multiplication , Addition, Subtraction


        short s = 10;
        char c = 'A';      // ASCII value of A is 65
        System.out.println(c+s);    // Output is 75

    }
}
