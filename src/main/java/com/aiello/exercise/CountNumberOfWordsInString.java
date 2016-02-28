package com.aiello.exercise;

public class CountNumberOfWordsInString {
    public static int wordcount(String value) {
        String[] splits = value.split(" ");
        return splits.length;
    }
}
