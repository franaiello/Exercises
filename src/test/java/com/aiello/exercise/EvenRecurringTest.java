package com.aiello.exercise;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Write a function which takes in a int []
 * - all integers in the array are assumed to be even occurring.
 * - except for one integer which occurs odd no. of times
 * <p/>
 * the function finds the odd occurring integer and returns it.
 * <p/>
 * [1,2,3,2,2,3,1] = 2
 */
public class EvenRecurringTest {

    @Test
    public void getHighestRecurringValue() {
        int result = EvenRecurring.getHighestRecurringValue(new int[]{1, 2, 3, 2, 2, 3, 1});
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void findOddOccurrencesOne() {
        int result = EvenRecurring.findOddOccurrencesOne(new int[]{1, 2, 3, 2, 2, 3, 1});
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void findOddOccurrencesUsingbitwiseXOR() {
        int result = EvenRecurring.findOddOccurrencesUsingBitwiseXOR(new int[]{1, 2, 3, 2, 3, 1, 3});
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void findOddOccurrencesTwo() {
        List<Integer> result = EvenRecurring.findOddOccurrencesTwo(new int[]{2, 3, 2, 3, 3, 4, 5, 4, 2, 2, 5, 6});
        assertThat(result).isEqualTo(new ArrayList<Integer>(Arrays.asList(3,6)));
    }
}
