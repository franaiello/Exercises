package com.aiello.exercise.characters;


import com.aiello.exercise.strings.CharCounterInString;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CharCounterInStringTest {
    @Test
    public static void getCharCountInString() {
        int result = CharCounterInString.getCharCountInString("ABCDDEFDD", 'D');
        assertThat(result).isEqualTo(4);
    }
}
