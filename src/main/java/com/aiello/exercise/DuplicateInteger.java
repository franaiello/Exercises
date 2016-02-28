package com.aiello.exercise;

import java.util.*;

/**
 * Given an int array of size N  that has elements from 1 to N - 1.
 * Only one element is repeated. How do we find this element.
 *
 * Example input:
 *     a=[3,2,1,3,4]
 *
 * Example output:
 *     3
 **/
class DuplicateInteger {

    public static List<Integer> findDuplicate(Integer[] array) {
        List<Integer> duplicates = new ArrayList<Integer>();
        Set<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i <= array.length - 1; i++) {
            if (!hashSet.add(array[i])) {
                duplicates.add(array[i]);
            }
        }

        return duplicates;
    }

    /**
     * Method sums up all values in array and also sums up just the
     * distinct values and then subtracts the difference which will
     * result in the duplicate value.
     * @param array
     * @return
     */
    public static Integer findDuplicateTwo(Integer[] array) {
        // Purposely eliminate duplicate values
        Set<Integer> uniqueNumbers = new HashSet<Integer>(Arrays.asList(array));
        Integer sumUniqueNumbers = 0;

        //the set will contain no duplicate values...
        for (int t : uniqueNumbers) {
            sumUniqueNumbers = sumUniqueNumbers + t;
        }

        // Get the sum of all array values
        Integer sumArray = 0;
        for (Integer value : array) {
            sumArray = sumArray + value;
        }

        return sumArray - sumUniqueNumbers;
    }
}