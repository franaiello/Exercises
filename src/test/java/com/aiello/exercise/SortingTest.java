package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortingTest {

    @Test
    public void testAddThreeSorted() {
        int[] unsorted={3,1,2};
        int[] sorted = Sorting.sortManually(unsorted);
        assertThat(sorted[0]).isEqualTo(1);
        assertThat(sorted[1]).isEqualTo(2);
        assertThat(sorted[2]).isEqualTo(3);
    }

    @Test
    public void testAddThreeSortedTwo() {
        int[] unsorted={6, 4, 5};
        int[] sorted = Sorting.sortWithAPI(unsorted);
        assertThat(sorted[0]).isEqualTo(4);
        assertThat(sorted[1]).isEqualTo(5);
        assertThat(sorted[2]).isEqualTo(6);
    }

    @Test
    public void getSecondLargestValue() {
        int[] unsorted={6,4,5,7,8};
        int result = Sorting.getSecondLargestValue(unsorted);
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void sortStringWithoutAPI() {
        String result = Sorting.sortStringWithoutAPI("zwbyucqaiy");
        assertThat(result).isEqualTo("abciquwyyz");
    }
}