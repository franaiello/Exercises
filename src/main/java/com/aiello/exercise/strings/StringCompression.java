package com.aiello.exercise.strings;

public class StringCompression {

    /**
     * Method inspects the input string for repeated characters and
     * returns the letter followed by the count of that specific letter.
     *
     * Example:
     *    Input:   aabcccccaa
     *    Output:  a2b1c5a2
     *
     * @param str
     * @return
     */
    public static String compress(String str) {
        String mystr = "";
        int count=1;
        char last = str.charAt(0);

        for (int i=1; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == last) {
                count++;
            } else { // Insert char count, and update last char
                mystr+= last + "" + count;
                last = str.charAt(i);
                count = 1;  // reset count
            }
        }

        return mystr + last + count;
    }

    public static String compressBetter(String str) {
        int size = countCompression(str);
        if(size >= str.length()) {
            return str;
        }

        StringBuffer mystr = new StringBuffer();
        char last = str.charAt(0);  // start at zeroth element
        int count = 1;

        for(int i=1; i < str.length(); i++) {
            if (str.charAt(i) == last) {  // found repeated char
                count++;
            } else {  // insert char count, and update last char
                mystr.append(last); // insert char
                mystr.append(count); // insert count
                last = str.charAt(i);
                count = 1;
            }
        }

        mystr.append(last);
        mystr.append(count);
        return mystr.toString();

    }

    private static int countCompression(String str) {
        if(str==null || str.isEmpty()) return 0;
        char last = str.charAt(0);
        int size = 0;
        int count = 1;
        for(int i=1; i< str.length(); i++) {
            if(str.charAt(i) == last) {
                count++;
            } else {
                last = str.charAt(i);
                size += 1 + String.valueOf(count).length();
                count = 1;
            }
        }

        size += 1 + String.valueOf(count).length();
        return size;
    }

    public static String compressAlternate(String str) {
        /* Check if compression would create a longer string */
        int size = countCompression(str);
        if(size >= str.length()) {
            return str;
        }

        char[] array = new char[size];
        int index=0;
        char last = str.charAt(0);
        int count = 1;

        for(int i=1; i < str.length(); i++) {
            if(str.charAt(i) == last) { // found repeated character
                count++;
            } else {
                /* Update the repeated character count */
                index = setChar(array, last, index, count);
                last = str.charAt(i);
                count = 1;
            }
        }

        /* Update string with the last set of repeated characters. */
        index = setChar(array, last, index, count);
        return String.valueOf(array);
    }

    private static int setChar(char[] array, char c, int index, int count) {
        array[index] = c;
        index++;
        /* Convert the count to a string, then to an array of chars */
        char[] cnt = String.valueOf(count).toCharArray();

        /* Copy characters from biggest digit to smallest */
        for(char x : cnt){
            array[index] = x;
            index++;
        }

        return index;
    }
}
