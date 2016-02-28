package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountNumberOfWordsInStringTest {

    @Test
    public void getCount() {
        int result = CountNumberOfWordsInString.wordcount("Alive is awesome");
        assertThat(result).isEqualTo(3);

        result = CountNumberOfWordsInString.wordcount("manchester united is also known as red devil");
        assertThat(result).isEqualTo(8);
    }

}
