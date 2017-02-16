package com.aiello.exercise.datastructures;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListExampleTest {

    @Test
    public void getLinkedListFirstValue() {
        String value = LinkedListExample.getLinkedListValue(0);
        assertThat(value).isEqualTo("one");
    }

    @Test
    public void getLinkedListCount() {
        int count = LinkedListExample.getLinkedListCount();
        assertThat(count).isEqualTo(3);
    }

    @Test (dependsOnMethods = "getLinkedListCount")
    public void addValueToLinkedList() {
        LinkedListExample.addValueToLinkedList("four");
        int count = LinkedListExample.getLinkedListCount();
        assertThat(count).isEqualTo(4);
    }

    @Test (dependsOnMethods = "addValueToLinkedList")
    public void getLinkedListLastValue() {
        String value = LinkedListExample.getLinkedListValue(3);
        assertThat(value).isEqualTo("four");
    }

    @Test (dependsOnMethods = "getLinkedListLastValue")
    public void deleteLastValue() {
        LinkedListExample.deleteValue(3);
        int count = LinkedListExample.getLinkedListCount();
        assertThat(count).isEqualTo(3);
    }
}
