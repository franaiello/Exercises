package com.aiello.exercise.characters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateChars {

    /**
     * Finds duplicate value using a HashSet
     * @param str
     * @return
     */
    public static String findDuplicateUsingHashSet(String str) {
        // this will house the duplicate characters that were duplicated
        StringBuilder duplicate= new StringBuilder();
        // the hashset will be used to store unique chars
        Set hashSet = new HashSet();

        // Iterate across string and extract each char
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(! hashSet.add(c)) {
                duplicate.append(c);
            }
        }

        return duplicate.toString();
    }

    /**
     * Finds duplicate value using a HashSet
     * @param strArray
     * @return
     */
    public static String findDuplicatesInArray(String[] strArray) {
        // this will house the duplicate characters that were duplicated
        StringBuilder duplicate= new StringBuilder();
        // the hashset will be used to store unique chars
        Set hashSet = new HashSet();

        for (String str : strArray) {
            // Iterate across string and extract each char
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!hashSet.add(c)) {
                    duplicate.append(c);
                }
            }
        }

        return duplicate.toString();
    }

    /**
     * Assumes that the duplicate value is directly next to previous value
     * @param unique
     * @return
     */
    public static String findDuplicateWithoutDataStructure(String unique) {
        String duplicate = "";
        Character previous = unique.charAt(0);

        for (int i=1; i<unique.length() - 1; i++) {
            char c = unique.charAt(i);
            if (c == previous) {
                duplicate = duplicate + c;
            }
            previous = c;
        }

        return duplicate;
    }

    public static boolean isUniqueChars(String str) {
        if(str.length() > 128) return false;

        boolean[] char_set = new boolean[256];
        for(int i=0; i < str.length(); i++) {
            int val = str.charAt(i);
            char c = str.charAt(i);
            if(char_set[val]) {
                return false; // Already found this char in string - duplicate
            }
            char_set[val] = true;
        }
        return true;
    }


    /**
     * Method uses a HashMap to store characters and their count
     * @param str
     * @return
     */
    public static String findDuplicateUsingHashMap(String str) {
        // Key=character, Value=number of occurrences
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                int count = map.get(c);
                map.put(c, ++count);
            }
        }

        StringBuffer stringBuffer = new StringBuffer();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if ( count > 1) {
                stringBuffer.append(entry.getKey());
            }
        }

        return stringBuffer.toString();
    }
}
