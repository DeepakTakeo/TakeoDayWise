package com.takeo.week3.day3;

public class Search {

        public static int sumOfIntegers(int n) {
            /*
             * This method calculates the sum of the first n positive integers.
             */
            int total = 0;
            for (int i = 1; i <= n; i++) {
                total += i;
            }
            return total;
        }

        public static void main(String[] args) {
            int n = 5;
            int sum = sumOfIntegers(n);
            System.out.println("Sum of the first " + n + " positive integers: " + sum);
        }

    /*Time complexity analysis:

    The loop iterates from 1 to n, performing constant-time operations (addition and assignment) on each iteration.
    The loop has n iterations, so the time complexity of the loop is O(n).
    In Big Theta notation, we can express the time complexity as Θ(n),
    as it is both the upper and lower bound for this algorithm's running time.
    The best-case and worst-case time complexity of this program are the same since the loop always runs n times.

    Therefore, the time complexity of the sumOfIntegers method is Θ(n).
    This means that the running time of the method grows linearly with the input size n.
*/
}
