package com.codecool.zsana.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EncryptionTest {

    @Test
    public void emptyString() {
        Assertions.assertEquals("", Encryption.encryption(""));
    }

    @Test
    public void StringWithOneSpace() {
        Assertions.assertEquals("", Encryption.encryption(" "));
    }

    @Test
    public void oneLetterWithSpaces() {
        Assertions.assertEquals("a", Encryption.encryption("  a  "));
    }

    @Test // length after removing spaces
    public void lengthIsOne() {
        Assertions.assertEquals("q", Encryption.encryption("q"));
    }

    @Test // not explained what is the requirement here
    public void lengthIsThree() {
        Assertions.assertEquals("aa a", Encryption.encryption("aaa"));
    }

    @Test
    public void stringWithoutSpaces() {
        Assertions.assertEquals("fto ehg ee dd", Encryption.encryption("feedthedog"));
        Assertions.assertEquals("clu hlt io", Encryption.encryption("chillout"));
    }

    @Test
    public void stringWithSpaces() {
        String s = "if man was meant to stay on the ground god would have given us roots";
        String result = "imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau";
        Assertions.assertEquals(result, Encryption.encryption(s));
    }

}