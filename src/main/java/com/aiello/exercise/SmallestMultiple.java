package com.aiello.exercise;

public class SmallestMultiple {

    public static boolean smallestDivisibleNumber(Integer multiple) {
        for (int i=1; i<=10; i++) {
            if(multiple % i != 0) {
                return false;
            }
        }

        return true;
    }
}
