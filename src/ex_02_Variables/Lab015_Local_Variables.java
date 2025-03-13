package ex_02_Variables;

public class Lab015_Local_Variables {

    public static void main(String[] args) {

        /*

           General Syntax for Declaring a Variable:-
                <data_type> <variable_name>;

           Syntax for Declaring and Initialising a Variable:-
                <data_type> <variable_name> = <variable_value>;

           Data Type – what kind of data that it can store. For example, int, string, float, char, etc.
                Variable Name – Identifier.
                =    - assignment operator
           Value – The data assigned to the variable.

         */

        byte local;
        local = 10;

        // byte -> data type (type of container)
        // store only integer value but limited to max and min (-128 to 127)
        // local -> variable_name (identifier)
        // = -> assignment operator (assign the value from right-hand to left-hand (RHV to LH) )
        // 10 -> literal (integer value)

        System.out.println(local);
        byte a = 20;
        System.out.println(a);

    }
}
