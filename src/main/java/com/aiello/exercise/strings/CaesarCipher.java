package com.aiello.exercise.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaesarCipher {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final Integer SPACE = 26;

    /**
     * Method accepts an encryption key and then applies that to the text
     * and returns the encrypted string
     * @param text
     * @param key
     * @return
     */
    public static String encrypt(String text, String key) {

        // Build the standard ALPHABET A=65, B=66
        Map<Integer, Character> alphabet = buildAlphabet();

        // Builds the encrypted map with keys A=68, B=69...
        Map<Character, Integer> encryptionKeysMap = buildEncryptedMap(key);

        // Encrypt the text using the encryptionKeysMap
        List<Integer> encryptedIntegers = encryptText(text, encryptionKeysMap);

        return returnEncryptedText(encryptedIntegers, alphabet);
    }

    /**
     * Method accepts a list of integers which are now the encrypted integer and
     * then returns the character associated with the encrypted integer
     * @param encryptedIntegers
     * @param alphabet
     * @return
     */
    private static String returnEncryptedText(List<Integer> encryptedIntegers, Map<Integer, Character> alphabet) {
        StringBuilder sb = new StringBuilder();

        for (Integer encryptedInt : encryptedIntegers) {
            Character encryptedChar = alphabet.get(encryptedInt);
            sb.append(encryptedChar);
        }

        return sb.toString();
    }


    /**
     * Method encrypts the text by using the encryptionKeysMap to replace each value with encrypted value
     * @param text
     * @param encryptionKeysMap
     * @return
     */
    private static List<Integer> encryptText(String text, Map<Character, Integer> encryptionKeysMap) {
        List<Integer> results = new ArrayList<>();

        // Iterate across the text and find corresponding charValue aka: A=65, B=66
        for (Character c : text.toCharArray()) {
            if (c.equals(' ')) {
                results.add(SPACE);
            } else {
                Integer encryptedValue = encryptionKeysMap.get(c);
                results.add(encryptedValue);
            }
        }
        return results;
    }

    /**
     * Method builds the encrypted map with keys A=68, B=69...
     * @param key
     */
    private static Map<Character, Integer> buildEncryptedMap(String key) {
        Map<Character, Integer> map = new HashMap<>();

        // Starting at A=65 we are offsetting based upon the key
        int index=65;

        // Build list of key/value pairs
        for (char c : key.toCharArray()) {
            map.put(c, index++);
        }

        return map;
    }

    /**
     * Method builds the standard alphabetic map A=65, B=66...
     * It also includes a SPACE=" " when reconstructing a sentence
     * which even though encrypted requires spaces between words
     * @return
     */
    private static Map<Integer, Character> buildAlphabet() {
        Map<Integer, Character> map = new HashMap<>();

        // Starting at A=65, B=66
        int index=65;

        // Build list of key/value pairs
        for (char c : ALPHABET.toCharArray()) {
            map.put(index++, c);
        }

        // Add a space when returning text to consumer
        map.put(26, ' ');

        return map;
    }
}
