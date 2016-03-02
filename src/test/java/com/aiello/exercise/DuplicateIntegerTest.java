package com.aiello.exercise;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Given an int array of size N  that has elements from 1 to N - 1.
 * Only one element is repeated. How do we find this element.
 *
 * Example input:
 *     a=[3,2,1,3,4]
 *
 * Example output:
 *     3
 **/
public class DuplicateIntegerTest {

    @Test
    public void findDuplicate_Valid() {
        Integer[] array = {3,2,1,3,4};

        List<Integer> duplicates = DuplicateInteger.findDuplicate(array);
        assertThat(duplicates.size()).isEqualTo(1);

        duplicates = DuplicateInteger.foo(array);
        assertThat(duplicates.size()).isEqualTo(1);
    }

    @Test
    public void findDuplicate_Invalid() {
        Integer[] array = {3,2,1,4};

        List<Integer> duplicates = DuplicateInteger.findDuplicate(array);
        assertThat(duplicates).isEmpty();
    }

    /************************************************************************
        Given an int array of size N  that has elements from 1 to N - 1.
        Only one element is repeated.
        How do we find this element.

        Example input:
        a=[3,2,1,3,4]

        Example output:
        3

        sum(a) = 13
        sum(1,2,3,4) = 10
        13 - 10 = 3
     *************************************************************************/
    @Test
    public void findDuplicateTwo_Valid() {
        Integer[] array = {3,2,1,3,4};

        Integer duplicate = DuplicateInteger.findDuplicateTwo(array);
        assertThat(duplicate).isEqualTo(3);
    }

    @Test
    public void findDuplicateThree_Valid() {
        Integer[] array = { 1, 2, 3, 6, 4, 1, 7, 8, 9, 3, 2, 2, 5, 3, 4, 3, 6, 4 };

        List<Integer> duplicates = DuplicateInteger.findDuplicate(array);
        assertThat(duplicates.size()).isGreaterThan(0);
    }
}
