package com.aiello.exercise;

public class EvenOrOdd {

    /**
     * Method determines if the product of two numbers is even or odd and
     * will return true if even and false if odd
     * @param x
     * @param y
     * @return
     */
    public static boolean isProductEvenOrOdd(int x, int y) {
        int product = x * y;
        if ((product & 1) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
