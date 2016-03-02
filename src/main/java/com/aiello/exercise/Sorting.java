package com.aiello.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

    public static int[] sortManually(int[] unsorted) {
        int temp1;
        int temp2;

        for (int i=0; i<= unsorted.length - 1; i++) {
            if (i+1 < unsorted.length) {
                if (unsorted[i] > unsorted[i+1]) {
                    temp1 = unsorted[i];
                    temp2 = unsorted[i+1];
                    unsorted[i] = temp2;
                    unsorted[i+1] = temp1;
                }
            }
        }

        return unsorted;
    }

    public static int[] sortWithAPI(int[] unsorted) {
        Arrays.sort(unsorted);
        return unsorted;
    }

    public static int getSecondLargestValue(int[] unsorted) {
        Arrays.sort(unsorted);
        List<Integer> list = new ArrayList<Integer>();
        for (int x : unsorted) {
            list.add(x);
        }

        return list.get(list.size()-2);
    }


    /**
     * Method accepts an unsorted string and returns a sorted string
     * @param unsorted
     * @return
     */
    public static String sortStringWithoutAPI(String unsorted) {
        char[] sortedCharArray = unsorted.toCharArray();

        Arrays.sort(sortedCharArray);

        return new String(sortedCharArray);
    }
}
