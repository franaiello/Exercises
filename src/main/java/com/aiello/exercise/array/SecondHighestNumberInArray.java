package com.aiello.exercise.array;


import java.util.Arrays;

public class SecondHighestNumberInArray {
    /**
     * Method finds the second highest value in array without sorting
     * @param array
     * @return
     */
    public static Integer findSecondHighestValue(Integer[] array) {
        Integer highestValue=Integer.MIN_VALUE;
        Integer secondHighestValue=Integer.MIN_VALUE;


        for (int value : array) {
            if (value > highestValue) {
                // Store the second highest value prior to setting the highest value
                secondHighestValue = highestValue;

                highestValue = value;
            } else {
                if (value > secondHighestValue) {
                    secondHighestValue = value;
                }
            }
        }

        return secondHighestValue;
    }

    /**
     * Method finds the second highest value in array using sorting
     * @param array
     * @return
     */
    public static Integer findSecondHighestValueUsingSorting(Integer[] array) {
        Arrays.sort(array);
        return array[array.length - 2];

    }
}
