package ex_03_Literals;

import java.util.Arrays;

public class Lab027_Non_Primitive_Literals {

    public static void main(String[] args) {

        // Primitive Data Types - Defined by Java guys
        // Max, Min, Size defined

        byte b = 10; // 1 Byte -> 8 Bits
        int age = 65; // 4 Byte -> 32 Bits


        // Non-Primitive Data Types - Defined by users, Also called as Reference Data Types
        // No Size, no max, no min
        // Byte size for Non-Primitive Data types is 8 i.e. 64 Bits.
        String name = "Java"; // String is a bunch of char.
        int[] intArray = new int[] {1,2,3,4,5};
        String[] strArray = new String[] {"This", "is", "String"};
        // string, arrays, classes, enum...etc.

        System.out.println(name);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));

    }
}
