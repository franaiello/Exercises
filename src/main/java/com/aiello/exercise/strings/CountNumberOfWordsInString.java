package com.aiello.exercise.strings;

public class CountNumberOfWordsInString {
    public static int wordcount(String value) {
        String[] splits = value.split(" ");
        return splits.length;
    }
}
