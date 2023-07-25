package com.takeo.week1.day5;

/*Bitwise operators have several use cases,particularly in scenarios that involve low-level programming,  //PASCAL //Ruby
  and also low-level manipulation of individual bits in binary data,
   compact representation of multiple boolean flags or states within an integer,
   or when optimizing performance-critical operations that can be efficiently handled at the bit level
 */

public class BitwiseOperations {

    public static void main(String[] args) {

        int num1 = 5;  // Binary representation: 0000 0101   ///
        int num2 = 3;  // Binary representation: 0000 0011

        int result = num1 & num2;  //bitwise and

        /*num1:  0000 0101
        num2:    0000 0011
        result:  0000 0001*/  //=1

        System.out.println("Bitwise AND:");
        System.out.println(num1 + " & " + num2 + " = " + result);
        // Output: 1 (Binary representation: 0000 0001)


        int num3 = 5;  // Binary representation: 0000 0101
        int num4 = 3;  // Binary representation: 0000 0011

        int result1 = num1 | num2; //bitwise or
        System.out.println("Bitwise OR:");
        System.out.println(num1 + " | " + num2 + " = " + result); // Output: 7 (Binary representation: 0000 0111)

        // Faster alternative to divide by 2
        int num = 16;
        int result6 = num >> 2; // Equivalent to num / 2, but faster  //right shift operator

        // 8/2 in   -- >my 8>> 1

        /*num (binary):   0001 0000
        num >> 1:         0000 0100*/

        System.out.println(result6);

        // Faster alternative to multiply by 4
        int num6 = 5;
        int result2 = num6 << 2; // Equivalent to num2 * 4, but faster  //left shift operator

        /*num6 (binary):  0000 0101
        num6 << 2:        0001 0100*/

        System.out.println(result2);


    }
}