package ex_03_Literals;

public class Lab025_Base_Literals {

    public static void main(String[] args) {

        //  Decimal Literal (Base 10)
        int age =65;  // Decimal Number System of base 10


        //Binary Literal (Base 2)
        int binary_num1 = 0b1010;    // Binary literals start with 0b or 0B.
                                     // Here Binary literal-> 1010 is converted to Decimal Number-> 10 in output.
                                     // We can use RapidTables to convert from one base number to another base number.
        int binary_num2 = 0B101010;  // Here Binary literal-> 101010 is converted to Decimal Number-> 42 in output.


        // Octal Literal (Base 8)
        int octal1 = 0101;   // Octal literals start with 0.
                             // Here Octal literal-> 101 is converted to Decimal Number-> 65 in output.
                             // We can use RapidTables to convert from one base number to another base number.
        int octal2 = 01010;  // Here Octal literal-> 1010 is converted to Decimal Number-> 520 in output.

        // Hexadecimal Literal (Base 16)
        int hex1 = 0xface;  // Hexadecimal literals start with 0x or 0X.
                            // Here Hexadecimal literal-> face is converted to Decimal Number-> 64206 in output.
                            // We can use RapidTables to convert from one base number to another base number.
                            //base 16 color combination are in hex - #28a745
        int hex2 = 0Xface1;  // Here Hexadecimal literal-> face1 is converted to Decimal Number-> 1027297 in output.

        System.out.println(binary_num1);
        System.out.println(binary_num2);
        System.out.println(octal1);
        System.out.println(octal2);
        System.out.println(hex1);
        System.out.println(hex2);

    }

}
