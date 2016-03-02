package com.aiello.exercise.characters;

public class RemoveSpecificCharsFromString {
    public static String removeSpecificCharsUsingRegEx(String originalStr, String charsToRemove) {
        // Create regex expression - including case insensitive
        String regex = "(?i)[" + charsToRemove + "]+";
        originalStr = originalStr.replaceAll(regex, "");

        return originalStr;
    }

    public static String replaceSpecificChars(String input, String replacement) {
        String result=input;

        for (Character c : replacement.toCharArray()) {
            result = result.toLowerCase().replace(c.toString(), "");
        }

        return result;
    }
}
