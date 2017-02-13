package com.aiello.exercise.recursion;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursionTest {

    @Test (enabled = false)
    public void foo() {
        Recursion.myFunction(3);
    }

    @Test(enabled = true)
    public void fibonacciUsingRecursion() {
        int result = Recursion.fibUsingRecursion(7);
        assertThat(result).isEqualTo(13);
    }

    @Test(enabled=true)
    public void fibonacciWithoutRecursionWithoutArray() {
        int[] result = Recursion.fibonacci(7);
        assertThat(result).isEqualTo(new Integer[]{0,1,1,2,3,5,8});
    }

    @Test(enabled = true)
    public void fibonacciWithoutRecursion() {
        int result = Recursion.fibWithoutRecursion(7);
        assertThat(result).isEqualTo(13);
    }

    @Test (enabled = false)
    public void anagrams() {
        Recursion.anagrams("", "east");
    }

    @Test (enabled = true)
    public void printOneToTenWithoutLoop() {
        List<Integer> list = new LinkedList<>();
        List<Integer> result = Recursion.printOneToTenWithoutLoop(1, list);
        assertThat(result).contains(new Integer[]{1,2,3,4,5,6,7,8,9,10});
    }

}
