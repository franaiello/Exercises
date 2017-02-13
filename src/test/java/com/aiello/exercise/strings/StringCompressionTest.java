package com.aiello.exercise.strings;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCompressionTest {
    private static final String ORIGINAL = "aabcccccaa";
    private static final String RESULT = "a2b1c5a2";

    @Test
    public static void compress() {
        String result = com.aiello.exercise.strings.StringCompression.compress(ORIGINAL);
        assertThat(result).isEqualTo(RESULT);
    }

    @Test
    public static void compressBetter() {
        String result = com.aiello.exercise.strings.StringCompression.compressBetter(ORIGINAL);
        assertThat(result).isEqualTo(RESULT);
    }

    @Test
    public static void compressAlternate() {
        String result = com.aiello.exercise.strings.StringCompression.compressAlternate(ORIGINAL);
        assertThat(result).isEqualTo(RESULT);
    }
}
