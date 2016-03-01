package com.aiello.exercise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitArrayApart {


    /**
     * Method takes two parameters, the first is an integer array to
     * split apart and the second argument is how many times you want
     * to split up the array into separate individual arrays
     *
     * @param array
     * @param splitInto Example: array [1,2,3,4,5,6]
     *                  returns [1,2] [3,4] [5,6]
     */
    public static List<int[]> splitIntegerArray(int[] array, int splitInto) {
        int subArraySize = array.length / splitInto;
        List<int[]> list = new ArrayList<int[]>();

        for (int i = 0; i <= array.length - 1; i = i + subArraySize) {
            list.add(Arrays.copyOfRange(array, i, i + subArraySize));
        }

        return list;
    }

    /**
     * Method takes two parameters, the first is a String array to
     * split apart and the second argument is how many times you want
     * to split up the array into separate individual arrays
     *
     * @param array
     * @param splitInto
     * @return
     */
    public static List<String[]> splitStringArray(String[] array, int splitInto, boolean reverse) {
        int subArraySize = array.length / splitInto;
        List<String[]> list = new ArrayList<String[]>();
        //List<String[]> reverseList = new ArrayList<String[]>();

        for (int i = 0; i <= array.length - 1; i = i + subArraySize) {
            list.add(Arrays.copyOfRange(array, i, i + subArraySize));
        }

        // shall we reverse the order of sub arrays?
        if (reverse) {
            List<String[]> reverseList = reverseList(list);
            return reverseList;
        }

        return list;
    }

    /**
     * Accepts a list of string arrays and returns a reverse order
     *
     * @param list
     * @return
     */
    private static List<String[]> reverseList(List<String[]> list) {
        List<String[]> reverseList = new ArrayList<String[]>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }

        return reverseList;
    }

    /**
     * Accepts a list of string arrays and reverses each element within
     * string array and returns new list
     *
     * @param list
     * @return
     */
    public static List<String[]> reverseElementsInEachStringArray(List<String[]> list) {
        List<String[]> reverseList = new ArrayList<String[]>();

        for (int i = list.size() - 1; i >= 0; i--) {
            String[] array = list.get(i);
            Collections.reverse(Arrays.asList(array));
            reverseList.add(array);
        }

        return reverseList;
    }
}
