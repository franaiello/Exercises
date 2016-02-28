package com.aiello.exercise;

import java.util.ArrayList;
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
