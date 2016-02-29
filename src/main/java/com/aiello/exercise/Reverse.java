package com.aiello.exercise;

public class Reverse {

    /**
     * Accepts a character array and returns this in reverse order
     * @param original
     * @return
     */
    public static Character[] reverseCharacterArray(Character[] original) {
        if (isCharacterArrayNullOrEmpty(original)) return original;

        Character[] result = new Character[original.length];

        int index=0;

        for (int i = original.length - 1; i >= 0; i--, index++) {
            result[index] = original[i];
        }

        return result;
    }

    /**
     * Accepts a string and returns it in reverse
     * @param original
     * @return
     */
    public static String reverseString(String original) {
        if (isStringNullZeroLength(original)) return original;

        char[] reverse = new char[original.length()];

        for (int i = 0, j=original.length()-1; i <= original.length() - 1; i++, j--) {
            reverse[j] = original.charAt(i);
        }

        return new String(reverse);
    }

    /**
     * Method acceps a string and returns it in reverse
     * @param original
     * @return
     */
    public static String reverseStringUsingCharArray(String original) {
        if (isStringNullZeroLength(original)) return original;

        char[] origCharArray = original.toCharArray();
        char[] resultCharArray = new char[origCharArray.length];

        int i = origCharArray.length - 1;

        for (char c : origCharArray) {
            resultCharArray[i--] = c;
        }

        return new String(resultCharArray);
    }

    /**
     * Accepts a integer array and returns each value in reverse order
     * @param original
     * @return
     */
    public static int[] reverseIntegerArray(int[] original) {
        if (isIntArrayNullOrEmpty(original)) return original;

        int[] reverse = new int[original.length];
        int index=0;

        for (int i = original.length - 1; i >= 0; i--, index++) {
            reverse[index] = original[i];
        }

        return reverse;
    }

    public static int[] reverseIntegerArrayTwo(int[] original) {
        if (isIntArrayNullOrEmpty(original)) return original;

        int[] resultIntArray = new int[original.length];
        int i = original.length - 1;

        for (int value : original) {
            resultIntArray[i--] = value;
        }

        return resultIntArray;
    }

    /**
     * Method accepts an integer and reverses the integer
     * e.g; 1234 returns 4321
     * @param original
     * @return The return value in reverse
     */
    public static Integer reverseNumbers(Integer original) {
        char[] origArray = original.toString().toCharArray();
        char[] resultArray = new char[origArray.length];

        int i = origArray.length - 1;

        for (char c : origArray) {
            resultArray[i--] = c;
        }

        String resultStr = new String(resultArray);
        return Integer.parseInt(resultStr);
    }

    public static Integer reverseNumbersImproved(Integer original) {
        int rev = 0;while (original > 0) {
            int rem = original % 10;
            rev = rem + (rev * 10);
            original = original / 10;
        }

        return rev;
    }

    private static boolean isIntArrayNullOrEmpty(int[] original) {
        if (original == null || original.length == 0) {
            return true;
        }
        return false;
    }

    private static boolean isCharacterArrayNullOrEmpty(Character[] original) {
        if (original == null || original.length == 0) {
            return true;
        }
        return false;
    }

    private static boolean isStringNullZeroLength(String original) {
        if (original == null || original.length() == 0) {
            return true;
        }
        return false;
    }
}
