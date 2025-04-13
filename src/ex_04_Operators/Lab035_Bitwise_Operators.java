package ex_04_Operators;

public class Lab035_Bitwise_Operators {

    public static void main(String[] args) {

        // BITWISE OPERATORS //  // Optional to learn - Digital Electronics //
        //  Bitwise Operators - Not important for Automation
        // & (AND)
        // (|) OR
        // (^) XOR
        // (~) NOT
        // (<<) Left shift
        // (>>) Right shift
        // (>>>) Unsigned Right Shift


        // We can check decimal and binary representation of numbers in Rapid Table  //

        int a = 5;    // 0101 in binary
        int b = 3;   // 0011 in binary
        int result1 = a & b;  // Result is 1 if both bits are 1, otherwise 0.
        System.out.println(result1);    //   Output: 1 (0001 in binary)

        int result2 = a | b;           // Result is 1 if at least one of the bits is 1, otherwise 0.
        System.out.println(result2);   // Output: 7 (0111 in binary)

        int result3 = a ^ b;           // Result is 1 if the bits are different, otherwise 0.
        System.out.println(result3);   //   Output: 6 (0110 in binary)

        a = 5;                         // 0101 in binary
        int result4 = ~a;
        //The tilde operator ~ is a bitwise NOT operator.
        // Bitwise NOT inverts all the bits of a number.
        // In two's complement representation, ~ x = -(x+1).
        System.out.println(result4);   //   Output: -(5+1) = -6

        a = 5;  //  0101 in binary
        int result5 = a << 1;
        // Shifts the bits to the left by a specified number of positions
        System.out.println(result5);    //   Output: 10 (1010 * (1 * power of 2) = 1010 in binary)

        a = 5;  //  0101 in binary
        int result6 = a >> 1;
        // Shifts the bits to the right by a specified number of positions while preserving the sign bit
        System.out.println(result6);    //   Output: 2 (0010 * (1 * power of 2) = 0010 in binary)


        a = 13;  //  1101 in binary
        int result7 = a >>> 2;
        // Shifts the bits to the right by a specified number of positions,
        // filling the leftmost bits with 0 regardless of the sign
        System.out.println(result7);    //   Output: 3 (0011 * (1 * power of 2) = 0011 in binary)
    }
}
