package com.aiello.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a function which takes in a int []
 - all integers in the array are assumed to be even occurring.
 - except for one integer which occurs odd no. of times

 the function finds the odd occurring integer and returns it.

 [1,2,3,2,2,3,1] = 2

 */
public class EvenRecurring {

    /**
     * Method uses a HashMap to track the value and the occurrences of how
     * many times it appears in the array
     * @param array
     * @return
     */
    public static int findOddOccurrencesOne(int[] array) {
        Map<Integer, Integer> map = buildMap(array);
        return getOddOccurringValue(map);
    }

    public static int getHighestRecurringValue(int[] array) {
        Map<Integer, Integer> map = buildMap(array);
        return getHighestRecurringValue(map);
    }

    /**
     * Builds map structure in order to store value and its corresponding
     * number of times within array
     * @param array
     * @return
     */
    private static Map<Integer, Integer> buildMap(int[] array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int key : array) {
            if(map.containsKey(key)) {
                // if key is already in the map then
                // get count and increment by one
                int count = map.get(key);
                map.put(key, ++count);
            } else {
                // the key doesn't exist in the map so insert
                // it into map and set count equal to one
                map.put(key, 1);
            }
        }
        return map;
    }

    /**
     * Returns the highest recurring key based upon the highest recurrences
     * @param map
     * @return
     */
    private static int getHighestRecurringValue(Map<Integer, Integer> map) {
        // maxEntry will be used as a temp variable to store
        // the largest value
        Map.Entry<Integer,Integer> maxEntry = null;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }

    private static int getOddOccurringValue(Map<Integer, Integer> map) {
        int key = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            // Check first bit of value
            if ((entry.getValue() & 1) != 0) {
                key = entry.getKey();
                break;
            }
        }

        return key;
    }

    /**
     * Method uses a bitwise XOR to determine which value
     * within the array is odd occurring.
     * @param array
     * @return
     * @author http://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
     */
    public static int findOddOccurrencesUsingBitwiseXOR(int[] array) {
        int res = 0;
        for (int i=0; i< array.length; i++) {
            res = res ^ array[i];
        }

        return res;
    }

    public static List<Integer> findOddOccurrencesTwo(int[] array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            Integer freq = map.get(array[i]);
            map.put(array[i], (freq == null) ? 1 : freq + 1);
        }

        List<Integer> results = new ArrayList<Integer>();

        for(Map.Entry<Integer, Integer> nums : map.entrySet()) {
            if(nums.getValue() % 2 != 0) {
                results.add(nums.getKey());
            }
        }

        return results;
    }
}
