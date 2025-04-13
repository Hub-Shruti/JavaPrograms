package ex_03_Literals;

public class Lab026_Char_Literals {

    public static void main(String[] args) {

        char c1 = 'A';     // A to Z, a-z, !@#$%^&*()_+  are a part of character literals.
        //char c2 = "A";   // This is not a char. It is a string.
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' ';     // Blank space is also a character literal.


        // Escape Characters are also included in character literals. //
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("JavaProgram");
        System.out.println("Java"+new_line+"Program");
        System.out.println("Java"+tab_line+"Program");
        System.out.println("Java"+back_space+"Program");
        System.out.println("Java is a"+carriage_return+"Programming Language.");

        System.out.println("\n This is First line"+new_line+" This is Second line\n This is Third line");

        char c9 = 'A';             // ASCII (limited numbers) - A -> 65

        System.out.println(c9);

        /*

        ASCII stands for American Standard Code for Information Interchange.
        Every character enclosed in single quotation marks will have an integer equivalent value called as ASCII value.
        ASCII Value Range is 0 – 255.
        ASCII Value can be assigned to a char type variable.

        Standard ASCII is a 7-bit character set containing 128 characters (decimal values 0-127).
        It contains the numbers from 0-9, the upper and lower case English letters from A to Z, and some special characters
        while Extended ASCII uses 256 character codes (values 0-255).
        Extended ASCII includes characters not in standard ASCII,
        such as accented letters, graphics symbols and other special characters.

        But now people generally use UNICODE values.
         */

        char ascii = 65;
        System.out.println(ascii);
        char rupees = '₹';          // UNICODE (india, jap, china) - Rupees -> ₹
                                    // Unicode is capable of encoding more than 1.1 million characters.
        System.out.println(rupees);
        char smiley = '\u1f60';         // :)
        System.out.println(smiley);

        char smile  = '\u1F60';         // :)
        System.out.println(smiley);
    }
}
