package com.aiello.exercise.recursion;

import java.util.List;

public class Recursion {

    /**
     * Method was
     * @param n
     */
    public static void myFunction(int n) {
        if(n==0)
            return;
        else {
            System.out.println(n);
            myFunction(--n);
            System.out.println(n);
        }
    }


    /**
     * Method calculates the Fibonacci of value passed in and returns
     * the sum from previous series of numbers.
     *
     *            n:	0	1	2	3	4	5	6	7	8	9	10	11	…
     * nth Fibonacci:	0	1	1	2	3	5	8	13	21	34	55	89	…
     *
     * @param n
     * @return Returns the value of the nth series where n=7 should return 13
     */
    public static int fibUsingRecursion(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibUsingRecursion(n - 1) + fibUsingRecursion(n - 2);
        }
    }

    public static int fibWithoutRecursion(int n) {
        /* Declare an array to store fibonacci numbers */
        int[] array = new int[n+1];

        /* 0th and 1st number of the series are 0 and 1 */
        array[0] = 0;
        array[1] = 1;

        for (int i=2; i <=n; i++) {
            /* Add the previous two numbers in the series
                and store it */
            array[i] = array[i-1] + array[i-2];
        }

        return array[n];
    }

    public static int[] fibonacci(int n) {
        int a = 0;
        int b = 1;
        int[] sequence = new int[n];

        // Fill array with Fibonacci values.
        for (int i = 0; i < n; i++) {
            sequence[i] = a;

            int temp = a;
            a = b;
            b = temp + b;
        }

        return sequence;
    }

    public static void anagrams(String prefix, String word) {
        if(word.length() <= 1) {
            System.out.println(prefix + word);
        } else {
            for(int i=0; i < word.length(); i++) {
                String cur = word.substring(i, i++);
                String before = word.substring(0, i); // letters before cur
                String after = word.substring(i+1);  // letters after cur)
                anagrams(prefix + cur, before + after);
            }
        }
    }

    /**
     * Method returns a list of integers 1..10 without looping 
     * to generate data set
     * @param n
     * @param list
     * @return
     */
    public static List<Integer> printOneToTenWithoutLoop(int n, List<Integer> list) {
        if (n <= 10) {
            list.add(n);
            printOneToTenWithoutLoop(n+1, list);
        }

        return list;
    }
}
