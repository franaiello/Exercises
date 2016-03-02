package com.aiello.exercise.strings;

public class CharCounterInString {

    /**
     * Method searches a string for the number of occurrences of a
     * specific character and returns the count
     * @param str
     * @param findChar
     * @return
     */
    public static int getCharCountInString(String str, Character findChar) {
        int counter=0;
        for (Character c : str.toCharArray()) {
            if (c == findChar) {
                counter++;
            }
        }

        return counter;
    }
}
