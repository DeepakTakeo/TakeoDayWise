package com.takeo.week3.day2;

public class WrapperInteger {

    /*In Java, the Integer constant pool behaves differently for values between -128 and 127 compared to values outside this range.
     This behavior is related to the concept of "integer caching" or "integer pooling" and is done for optimization purposes.

     When you create an Integer object in Java using the Integer constructor or by using autoboxing (e.g., Integer i = 42;),
      Java maintains a pool of frequently used Integer objects for values in the range of -128 to 127.
      The rationale behind this optimization is that small integers are commonly used in many programs,
      especially in loops and array indices. By reusing the same Integer objects for these frequently used values,
      Java saves memory and improves performance.
      So, when you create an Integer object with a value within the range of -128 to 127,
       the JVM checks the constant pool first to see if an Integer object with that value already exists.
        If it does, it returns a reference to the existing object from the pool instead of creating a new one.
    Outside the range of -128 to 127, Java will create new Integer objects for each unique value, and they will not be pooled.
    */
    public static void main(String[] args) {

        Integer a = 42; // This will return a pooled Integer object.

        int j = 67;

        Integer value = j;  //compiler

        Integer ext = Integer.valueOf(j);  //ext

        //Integer a = Integer.valueOf(42); //autoboxing

        // -128 to 0 -0 127  --Integer pool

        String s = "ghy";
        String s1 = "ghy";

        Integer b = 42; // This will return the same pooled Integer object as 'a'.
        Integer c = 128; // This will create a new Integer object, not pooled.
        Integer d = 128; // This will create another new Integer object, not pooled.

        //  == operator will compare reference/memory address
        //  .equals() method  of string will compare value

      //  Integer value = Integer.valueOf(234);
        System.out.println(a == b); // Output: true (both 'a' and 'b' reference the same pooled object)
        System.out.println(c == d); // Output: false (two separate objects are created)

   /*     It's important to note that this behavior is specific to Integer objects and
        does not apply to other wrapper classes like Long, Short, Byte, etc
        Also, if you use valueOf() method explicitly, it will also cache values between -128 to 127.
        For example, Integer.valueOf(42) will return the pooled Integer object for the value 42.*/
    }
}
