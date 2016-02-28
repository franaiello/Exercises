package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EvenOrOddTest {
    @Test
    public void isProductEven() {
        boolean result = EvenOrOdd.isProductEvenOrOdd(3, 6);
        assertThat(result).isTrue();
    }

    @Test
    public void isProductOdd() {
        boolean result = EvenOrOdd.isProductEvenOrOdd(3, 9);
        assertThat(result).isFalse();
    }

    @Test
    public void isLargeProductEven() {
        boolean result = EvenOrOdd.isProductEvenOrOdd(66666666, 111111111);
        assertThat(result).isTrue();
    }

    @Test
    public void isNegativeProductEven() {
        boolean result = EvenOrOdd.isProductEvenOrOdd(-3, 6);
        assertThat(result).isTrue();
    }

    @Test
    public void isNegativeProductOdd() {
        boolean result = EvenOrOdd.isProductEvenOrOdd(-3, 9);
        assertThat(result).isFalse();
    }

    @Test
    public void isDoubleNegativeOddProductFalse() {
        boolean result = EvenOrOdd.isProductEvenOrOdd(-3, -9);
        assertThat(result).isFalse();
    }

    @Test
    public void isDoubleNegativeEvenProductFalse() {
        boolean result = EvenOrOdd.isProductEvenOrOdd(-3, -10);
        assertThat(result).isTrue();
    }
}
