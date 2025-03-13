package ex_02_Variables;

public class Lab018_Variable_DataTypes {

    public static void main(String[] args) {

        // PRIMITIVE DATA TYPES //

        // Numeric Types - Integral types, Floating-Point types

        // Integral Data Types
        byte Byte = 10;
      //  byte Byte = 128;   //  This is not valid variable_value
                             //  as byte (8 bits) can only store values from -128 to max 127 value
        short Short = 500;
        int Integer = 1101;
        char SingleCharacter = 'A';  // char stores single character
        char small = 'a';
        long Long = 123456789l;
        long long_value = 112233445566778899L;  // Both l and L are allowed after long variable_value

        // Floating-Point Data Types
        float Float = 123.123456789f;       // Decimal value which displays max 8 digits with round-off
        float Float_Decimal = 12345.123456789F;  // Both f and F are allowed after float variable_value
        double Double_LongDecimal = 123456.123456789; // Precise value

        // Boolean Types
        // Boolean Data Types
        boolean Java_is_case_sensitive = true;
        boolean Java_is_non_case_sensitive = false;

        System.out.println("Byte = "+ Byte);
        System.out.println("Short = "+ Short);
        System.out.println("Integer = "+ Integer);
        System.out.println("Character = "+ SingleCharacter);
        System.out.println("Small Character = "+ small);
        System.out.println("Long = "+ Long);
        System.out.println("Long value = "+ long_value);
        System.out.println("Float = "+ Float);
        System.out.println("Float value = "+ Float_Decimal);
        System.out.println("Double = "+ Double_LongDecimal);
        System.out.println("Is Java case-sensitive ? - "+ Java_is_case_sensitive);
        System.out.println("Is Java non-case sensitive ? - "+ Java_is_non_case_sensitive);

    }


}
