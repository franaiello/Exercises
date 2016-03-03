package com.aiello.exercise.strings;


import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Develop code to encrypt a string given the following encryption key "DEFGHIJKLMNOPQRSTUVWXYZABC".
 * The encryption key is positional, so that the letter A is replaced by D, B is replaced by E, etc.
 * We will ignore case in our substitutions.
 *
 * <a href="https://en.wikipedia.org/wiki/Caesar_cipher#Example">Caesar Cipher</a>
 */
public class CaesarCipherTest {
    @Test
    public void decryptMessage() {
        String result = CaesarCipher.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", "DEFGHIJKLMNOPQRSTUVWXYZABC");
        assertThat(result).isEqualTo("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD");


    }
}
