package com.aiello.exercise.characters;

import com.aiello.exercise.characters.RemoveSpecificCharsFromString;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveSpecificCharsFromStringTest {
    @Test
    public void replaceSpacesUsingStringBuffer() {
        String result = RemoveSpecificCharsFromString.removeSpecificCharsUsingRegEx("Alive is awesome", "alwsr");
        assertThat(result).isEqualTo("ive i eome");

        result = RemoveSpecificCharsFromString.removeSpecificCharsUsingRegEx("Learning never stops", "estp");
        assertThat(result).isEqualTo("Larning nvr o");
    }

    @Test
    public void replaceSpaces() {
        String result = RemoveSpecificCharsFromString.replaceSpecificChars("Alive is awesome", "alwsr");
        assertThat(result).isEqualTo("ive i eome");

        result = RemoveSpecificCharsFromString.replaceSpecificChars("Learning never stops", "estp");
        assertThat(result).isEqualTo("larning nvr o");
    }
}
