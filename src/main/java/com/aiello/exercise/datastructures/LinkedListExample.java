package com.aiello.exercise.datastructures;

import java.util.LinkedList;

public class LinkedListExample {
    private static LinkedList<String> myLinkedList = new LinkedList<String>();

    static {
        myLinkedList.add("two");
        myLinkedList.addFirst("one");
        myLinkedList.addLast("three");
    }

    public static String getLinkedListValue(int index) {
        return myLinkedList.get(index);
    }

    public static int getLinkedListCount() {
        return myLinkedList.size();
    }

    public static void addValueToLinkedList(String value) {
        myLinkedList.addLast(value);
    }

    public static void deleteValue(int index) {
        myLinkedList.remove(index);
    }
}
