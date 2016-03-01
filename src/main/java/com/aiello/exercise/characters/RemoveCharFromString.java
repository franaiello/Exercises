package com.aiello.exercise.characters;

public class RemoveCharFromString {
    public static String removeCharFromString(String str, Character charToRemove) {
        StringBuilder sb = new StringBuilder();

        for (Character c : str.toCharArray()) {
            if (c != charToRemove) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String removeCharFromStringByPosition(String str, int pos) {
        return str.substring(0, pos) + str.substring(pos + 1);
    }
}
