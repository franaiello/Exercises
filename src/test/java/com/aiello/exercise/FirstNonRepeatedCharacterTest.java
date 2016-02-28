package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstNonRepeatedCharacterTest {
    @Test
    public void findFirstNonRepeatedCharInString() {
        Character character = FirstNonRepeatedCharacter.findFirstNonRepeatedCharInString("stress");
        assertThat(character).isEqualTo('t');

        character = FirstNonRepeatedCharacter.findFirstNonRepeatedCharInString("teeter");
        assertThat(character).isEqualTo('r');

        character = FirstNonRepeatedCharacter.findFirstNonRepeatedCharInString("aftaftftftftrrrrvvvvvvnnnnnikgzghgh");
        assertThat(character).isEqualTo('i');
    }

    @Test
    public void findFirstNonRepeatedCharInStringImproved() {
        Character character = FirstNonRepeatedCharacter.findFirstNonRepeatedCharInString("stress");
        assertThat(character).isEqualTo('t');

        character = FirstNonRepeatedCharacter.findFirstNonRepeatedCharInStringImproved("teeter");
        assertThat(character).isEqualTo('r');

        character = FirstNonRepeatedCharacter.findFirstNonRepeatedCharInString("aftaftftftftrrrrvvvvvvnnnnnikgzghgh");
        assertThat(character).isEqualTo('i');
    }

}
