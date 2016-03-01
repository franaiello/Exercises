package com.aiello.exercise.arrays;

public class RemoveSubArrayFromArray {

    /**
     * Method accepts two arguments the first being the combined array and the second
     * argument is the array to remove from the combined array.  The method of finding
     * the sub-array is to assume that the first and last element define the sub-array
     * and any elements in between those are part of the sub-array to be deleted.
     * @param combinedArray
     * @param removeArray
     * @return
     */
    public static String[] removeSubArray(String[] combinedArray, String[] removeArray) {
        // Identify the first and last values of sub-array
        String firstValue = removeArray[0];
        String lastValue = removeArray[removeArray.length - 1];

        // Define the result array
        String[] result = new String[combinedArray.length - removeArray.length];

        int resultIndex=0;

        // Iterate across entire array
        for (int index=0; index<=combinedArray.length-1; index++) {

            // If the first and last values equal the elements from the 'removeArray'
            // we can assume that this is the sub-array
            if ( firstValue.equals(combinedArray[index]) && lastValue.equals(combinedArray[index + (removeArray.length-1)] )) {
                index = index + removeArray.length-1;
            } else {
                // Transfer value
                result[resultIndex++] = combinedArray[index];
            }

        }

        return result;
    }
}
