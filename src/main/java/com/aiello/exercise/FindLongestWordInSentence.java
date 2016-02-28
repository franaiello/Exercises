package com.aiello.exercise;


public class FindLongestWordInSentence {

    /**
     * Method finds the longest word within a sentence based
     * upon the character to find within a word
     * @param sentence
     * @param charToFind
     * @return
     */
    public static int findLongestWordInSentence(String sentence, char charToFind) {
        String[] words = sentence.split(" ");

        // Determine longest word amongst array elements
        int longestWord = 0;
        for (String word : words) {

            if (findCharInWord(word, charToFind)) {
                if (word.length() > longestWord) {
                    longestWord = word.length();
                }
            }
        }

        return longestWord;
    }

    /**
     * Mehtod finds a specific character in a word and will
     * return true if character exists within the word and
     * false otherwise.
     * @param word
     * @param charToFind
     * @return
     */
    private static boolean findCharInWord(String word, char charToFind) {
        boolean found=false;

        for (char c : word.toCharArray()) {
            if (c == charToFind) {
                found = true;
                break;
            }
        }
        return found;
    }
}
