package com.aiello.exercise;

import java.util.LinkedHashMap;
import java.util.Map;


public class FirstNonRepeatedCharacter {
    /**
     * Method accepts a string argument and parses each character one by one
     * searching for the first non repeated character in entire string.  This
     * version takes two passes to determine non repeated character.
     * @param str
     * @return
     */
    public static Character findFirstNonRepeatedCharInString(String str) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        Character firstNonRepeatingCharacter=null;

        // Convert to character array and store each character and its
        // number of occurrences in string
        for (char c : str.toLowerCase().toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c)+1);
            }
        }

        // Iterate across each entry and return the first character that is non-repeating
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                firstNonRepeatingCharacter = entry.getKey();
                break;
            }
        }

        return firstNonRepeatingCharacter;
    }

    /**
     * Method accepts a string argument and parses each character one by one
     * searching for the first non repeated character in entire string.  This
     * version performs the scan in one pass.
     * @param str
     * @return
     */
    public static Character findFirstNonRepeatedCharInStringImproved(String str) {
        Character firstNonRepeatingCharacter=null;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                firstNonRepeatingCharacter=c;
                break;
            }
        }
        return firstNonRepeatingCharacter;
    }
}
