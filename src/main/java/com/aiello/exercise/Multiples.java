package com.aiello.exercise;

public class Multiples {

    public static void main(String[] args) {
        // int sum = 0;
        // for (int i=0; i<1000; i++) {
        // 	if (((i%3) == 0) || ((i%5) == 0)) {
        // 		sum = sum + i;
        // 		System.out.println("i: " +i);
        // 	}
        // }
        // System.out.println("sum: "+sum);

        int retValue = sumOfMultiples(1000, new Integer[]{3, 5});
        System.out.println("sum: " + retValue);
    }


    public static int sumOfMultiples(Integer max, Integer[] moduloValues) {
        int sum = 0;
        if (moduloValues != null) {
            for (int i=0; i<max; i++) {
                sum = extractModuloValues(moduloValues, sum, i);
            }
        }

        return sum;
    }

    private static int extractModuloValues(Integer[] moduloValues, int sum, int i) {
        for(int j=0; j<moduloValues.length; j++) {
            if ((moduloValues[j] != null) && (moduloValues[j] > 0)) {
//                if (moduloValues[j] > 0) {
                    if (i% moduloValues[j] == 0) {
                        sum = sum + i;
                        break;
                    }
//                }
            }
        }
        return sum;
    }
}