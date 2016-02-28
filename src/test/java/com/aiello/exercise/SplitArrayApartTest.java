package com.aiello.exercise;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitArrayApartTest {
    // Split original array into thirds
    int splitIntoThirds = 3;

    // Split original array into halves
    int splitIntoHalves = 2;

    // Reverse the order of the sub-lists returned
    boolean reverse = false;


    @Test
    public void splitIntegerArray_IntoThirds() {
        List<int[]> list = SplitArrayApart.splitIntegerArray(new int[]{1, 2, 3, 4, 5, 6}, splitIntoThirds);
        assertThat(list).containsExactly(new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6});
    }

    @Test(enabled = false)
    public void splitIntegerArray_IntoHalves() {
        List<int[]> list = SplitArrayApart.splitIntegerArray(new int[]{1, 2, 3, 4, 5, 6}, splitIntoHalves);
        assertThat(list).containsExactly(new int[]{1, 2, 3}, new int[]{4, 5, 6});
    }

    @Test
    public void splitStringArray_IntoThirds() {
        List<String[]> list = SplitArrayApart.splitStringArray(new String[]{"a", "b", "c", "d", "e", "f"}, splitIntoThirds, reverse);
        assertThat(list).containsExactly(new String[]{"a", "b"}, new String[]{"c", "d"}, new String[]{"e", "f"});
    }

    @Test
    public void splitStringArray_IntoThirds_ReturnReverseOrder() {
        List<String[]> list = SplitArrayApart.splitStringArray(new String[]{"a", "b", "c", "d", "e", "f"}, splitIntoThirds, reverse = true);
        assertThat(list).containsExactly(new String[]{"e", "f"}, new String[]{"c", "d"}, new String[]{"a", "b"});
    }

    @Test
    public void splitStringArray_IntoHalves() {
        List<String[]> list = SplitArrayApart.splitStringArray(new String[]{"a", "b", "c", "d", "e", "f"}, splitIntoHalves, reverse);
        assertThat(list).containsExactly(new String[]{"a", "b", "c"}, new String[]{"d", "e", "f"});
    }

    @Test
    public void reverseElementsInEachStringArray() {
        List<String[]> input = new ArrayList<String[]>();
        input.add(new String[]{"a", "b"});
        input.add(new String[]{"c", "d"});
        input.add(new String[]{"e", "f"});
        List<String[]> list = SplitArrayApart.reverseElementsInEachStringArray(input);
        assertThat(list).containsExactly(new String[]{"f", "e"}, new String[]{"d", "c"}, new String[]{"b", "a"});
    }
}
