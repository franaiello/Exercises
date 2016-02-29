package com.aiello.exercise.array;

public class RemoveArrayFromAnother {
    public static String[] removeArray(String[] combinedArray, String[] removeArray) {
        // Identify the first and last values of array to hopefully identify entire array contents
        String firstValue = removeArray[0];
        String lastValue = removeArray[removeArray.length - 1];

        // Define the result array
        String[] result = new String[combinedArray.length - removeArray.length];

        // Iterate across entire array
        for (int i=0; i<=combinedArray.length-1; i++) {

            // Check if strings are the same (signal beginning of sub-array
            if ( firstValue.equals(combinedArray[i]) && lastValue.equals(combinedArray[i + (removeArray.length-1)] )) {

                // We can assume that we've found the entire sub-array given
                // we have found the first and last elements of sub-array
                for (int j=i; j<= (i + removeArray.length - 1); j++) {
                    result[j] = combinedArray[j];
                }
            } else {
                // Transfer value
                result[i] = combinedArray[i];
            }

        }

        return result;
    }
}
