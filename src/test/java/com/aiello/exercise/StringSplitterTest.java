package com.aiello.exercise;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringSplitterTest {
    @Test
    public static void splitStringOnDashes() {
        String delimiter="-";
        String[] result = StringSplitter.foo("Jan-Feb-March-April", delimiter);
        assertThat(result).containsExactly(new String[]{"Jan", "Feb", "March", "April"});
    }

    @Test
    public static void splitStringWithMissingDashes() {
        String delimiter="-";
        String[] result = StringSplitter.foo("Jan-Feb-March/April:May", delimiter);
        assertThat(result).containsExactly(new String[]{"Jan", "Feb", "March/April:May"});
    }
}
