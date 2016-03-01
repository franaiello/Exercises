package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DuplicateCharsTest {

    @Test
    public void findDuplicateUsingHashSet() {
        String unique = "ABCDEFFGHIJKLMNOKP";

        String duplicate = DuplicateChars.findDuplicateUsingHashSet(unique);
        assertThat(duplicate).isEqualTo("FK");
    }

    @Test
    public void findDuplicateUsingHashMap() {
        String unique = "ABCDEFFGHIJKLMNOKP";

        String foo = DuplicateChars.findDuplicateUsingHashMap(unique);
        assertThat(foo).isEqualTo("FK");
    }

    @Test
    public void findDuplicateWithoutDataStructure() {
        String unique = "ABCDEFFGHIJKKLMNOP";
        String duplicate = DuplicateChars.findDuplicateWithoutDataStructure(unique);
        assertThat(duplicate).isEqualTo("FK");
    }

    @Test
    public void isUniqueChars() {
        String unique = "ABCDEFGHIJKLMNOP";
        assertThat(DuplicateChars.isUniqueChars(unique)).isTrue();
    }

    @Test
    public void isNotUniqueChars() {
        String duplicates = "ABCKDEFGHIJKLMNOPF";
        assertThat(DuplicateChars.isUniqueChars(duplicates)).isFalse();
    }

    @Test
    public void findDuplicateReturnEachLength() {
        String[] duplicates = new String[]{"ab", "cd", "ewdwe", "edss", "Hello world"};
        assertThat(DuplicateChars.findDuplicatesInArray(duplicates));
    }


}
