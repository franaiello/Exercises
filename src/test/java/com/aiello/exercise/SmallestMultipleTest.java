package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestMultipleTest {
    @Test
    public void isSmallestMultiple_Valid() {
        assertThat(SmallestMultiple.smallestDivisibleNumber(2520)).isTrue();
    }

    @Test
    public void isSmallestMultiple_Invalid() {
        assertThat(SmallestMultiple.smallestDivisibleNumber(2521)).isFalse();
    }
}
