package ex_02_Variables;

public class Lab017_Variable_Names {

    public static void main(String[] args) {

        // VALID VARIABLE NAMES (IDENTIFIERS) //

        int _ = 75; // _(underscore) as a variable name is allowed but
        // usually not preferred as it creates confusion and throws an error while executing println()
        int $ = 56;
        int $Dollar = 50;
        int _$ = 25;
        int _012 = 65;
        int _underscore = 44;
        int _score11 = 89;
        int This_is_a_very_long_variable_name_12345 = 20;   // There is no set limit for a long name.
        // int enum = 10;     // enum is not a valid identifier since it is a keyword
        int Enum = 10;
        int valid$identifier = 30;

       // System.out.println("_ = "+_);  This will throw an error while execution
        System.out.println("$ = "+$);
        System.out.println("$Dollar = "+$Dollar);
        System.out.println("_$ = "+_$);
        System.out.println("_012 = "+_012);
        System.out.println("_underscore = "+_underscore);
        System.out.println("_score11 = "+_score11);
        System.out.println("This _is_a_very_long_variable_name_12345 = "+This_is_a_very_long_variable_name_12345);
        System.out.println("Enum = "+Enum);
        System.out.println("Valid identifier = "+valid$identifier);


    }
}
