package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HighestPossibleValueTest {
    @Test
    public void getHighestPositiveValue_Valid() {
        Integer[] array = {1,3,5,2,8,0,-1,3};
        int product = HighestPossibleValue.getHighestPositiveValueBySorting(array);
        assertThat(product).isEqualTo(120);
    }

    @Test
    public void getLowestPositiveValue_Valid() {
        Integer[] array = {1,-4,-5,1,3,2};
        int product = HighestPossibleValue.getHighestPositiveValueWithoutSorting(array);
        assertThat(product).isEqualTo(6);
    }

}
