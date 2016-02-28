package com.aiello.exercise;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLongestWordInSentenceTest {

    @Test
    public void findLongestWordInSentence() {
        String sentence = "i am able and ready";
        int result = FindLongestWordInSentence.findLongestWordInSentence(sentence, 'a');
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void findLongestWordInSentenceUsingD() {
        String sentence = "i am able and ready";
        int result = FindLongestWordInSentence.findLongestWordInSentence(sentence, 'n');
        assertThat(result).isEqualTo(3);
    }
}
