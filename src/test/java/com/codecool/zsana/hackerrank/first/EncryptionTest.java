package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EncryptionTest {

    @Test
    void emptyString() {
        Assertions.assertEquals("", Encryption.encryption(""));
    }

    @Test
    void StringWithOneSpace() {
        Assertions.assertEquals("", Encryption.encryption(" "));
    }

    @Test
    void oneLetterWithSpaces() {
        Assertions.assertEquals("a", Encryption.encryption("  a  "));
    }

    @Test // length after removing spaces
    void lengthIsOne() {
        Assertions.assertEquals("q", Encryption.encryption("q"));
    }

    @Test // not explained what is the requirement here
    void lengthIsThree() {
        Assertions.assertEquals("aa a", Encryption.encryption("aaa"));
    }

    @Test
    void stringWithoutSpaces() {
        Assertions.assertEquals("fto ehg ee dd", Encryption.encryption("feedthedog"));
        Assertions.assertEquals("clu hlt io", Encryption.encryption("chillout"));
    }

    @Test
    void stringWithSpaces() {
        String s = "if man was meant to stay on the ground god would have given us roots";
        String result = "imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau";
        Assertions.assertEquals(result, Encryption.encryption(s));
    }

}