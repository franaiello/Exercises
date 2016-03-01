package com.aiello.exercise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombineArrays {

    /**
     * Method accepts n-number of Integer arrays and combines
     * each of their values as one array
     * @param arrays
     * @return
     */
    public static Integer[] combineIntegerArrays(int[] ... arrays) {
        List<Integer> list = new ArrayList<Integer>();

        // Iterate across each array and extract integer values
        // from within each array
        for (int[] array : arrays) {
            for (int i = 0; i <= array.length - 1; i++) {
                list.add(array[i]);
            }
        }

        return list.toArray(new Integer[list.size()]);
    }

    /**
     * Method accepts three integer arrays and combines them into one
     * and then returns the array in reverse order
     * @param one
     * @param two
     * @param three
     * @param reverseOrder
     * @return
     */
    public static Integer[] combineAndReverseIntegerArrays(int[] one, int[] two, int[] three, boolean reverseOrder) {

        Integer[] results = new Integer[one.length + two.length + three.length];

        int i=0;
        for (int value : one) {
            results[i++] = value;
        }

        for (int value : two) {
            results[i++] = value;
        }

        for (int value : three) {
            results[i++] = value;
        }

        if (reverseOrder) {
            Arrays.sort(results, Collections.reverseOrder());
        }

        return results;
    }

    /**
     * Method accepts n-number of String arrays and combines
     * each of their values as one array
     * @param arrays
     * @return
     */
    public static String[] combineStringArrays(String[]... arrays) {
        List<String> list = new ArrayList<String>();

        for (String[] array : arrays) {
            for (int i = 0; i <= array.length - 1; i++) {
                list.add(array[i]);
            }
        }

        return list.toArray(new String[list.size()]);
    }
}
