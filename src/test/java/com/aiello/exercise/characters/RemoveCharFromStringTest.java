package com.aiello.exercise.characters;


import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveCharFromStringTest {
    @Test
    public void removeCharFromString() {
        String unique = "ABCDEFFGHIJKLMNOKP";

        String result = RemoveCharFromString.removeCharFromString(unique, 'F');
        assertThat(result).isEqualTo("ABCDEGHIJKLMNOKP");
    }

    @Test
    public void removeCharFromStringByPosition() {
        String unique = "ABCDEFFGHIJKLMNOKP";

        String result = RemoveCharFromString.removeCharFromStringByPosition(unique, 5);
        assertThat(result).isEqualTo("ABCDEFGHIJKLMNOKP");
    }
}
