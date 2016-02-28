package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplesTest {

    @Test
    public void sumOfMultiples_Valid() {
        int retValue = Multiples.sumOfMultiples(1000, new Integer[]{3, 5});
        assertThat(retValue).isEqualTo(233168);
    }

    @Test
    public void sumOfMultiples_NullArray() {
        int retValue = Multiples.sumOfMultiples(1000, null);
        assertThat(retValue).isEqualTo(0);
    }

    @Test
    public void sumOfMultiples_NullValueInArray() {
        int retValue = Multiples.sumOfMultiples(1000, new Integer[]{3, null});
        assertThat(retValue).isEqualTo(166833);
    }

    @Test
    public void sumOfMultiples_NullValuesInArray() {
        int retValue = Multiples.sumOfMultiples(1000, new Integer[]{null, null});
        assertThat(retValue).isEqualTo(0);
    }
}
