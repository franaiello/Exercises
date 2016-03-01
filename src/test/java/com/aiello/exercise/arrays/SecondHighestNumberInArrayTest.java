package com.aiello.exercise.arrays;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SecondHighestNumberInArrayTest {
    @Test
    public void getHighestPositiveValue_Valid() {
        Integer[] array = {1,3,5,2,8,10,-1,3};
        int product = SecondHighestNumberInArray.findSecondHighestValue(array);
        assertThat(product).isEqualTo(8);
    }

    @Test
    public void getHighestNegativeValue_Valid() {
        Integer[] array = {-1,-3,-5,-2,-8,-10};
        int product = SecondHighestNumberInArray.findSecondHighestValue(array);
        assertThat(product).isEqualTo(-2);

        Integer[] array2 = {-1,-2,-3,-5,-4,-8,-10};
        int result = SecondHighestNumberInArray.findSecondHighestValue(array2);
        assertThat(result).isEqualTo(-2);
    }

    @Test
    public void getSecondHighestNumberInArrayUsingSorting() {
        Integer[] array = {-1,-2,-3,-5,-4,-8,-10};
        int result = SecondHighestNumberInArray.findSecondHighestValueUsingSorting(array);
        assertThat(result).isEqualTo(-2);
    }
}
