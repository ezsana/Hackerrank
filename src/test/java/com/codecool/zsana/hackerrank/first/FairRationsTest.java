package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FairRationsTest {

    @Test
    void emptyArray() {
        int[] arr = {};
        Assertions.assertEquals("NO", FairRations.fairRations(arr));
    }

    @Test
    void arrayWithOnlyEvenNumbers() {
        int[] arr = {2,4,6};
        int[] arr1 = {2,4,6,8};
        Assertions.assertEquals("0", FairRations.fairRations(arr));
        Assertions.assertEquals("0", FairRations.fairRations(arr1));
    }

    @Test
    void arrayWithOnlyOddNumbers() {
        int[] arr1 = {1,3,5,7};
        Assertions.assertEquals("4", FairRations.fairRations(arr1));
    }

    // These two tests written according to hackerrank discussion
    @Test
    void sumOfNumbersIsOdd() {
        int[] arr = {2,4,5};
        int[] arr1 = {1,3,5};
        Assertions.assertEquals("NO", FairRations.fairRations(arr));
        Assertions.assertEquals("NO", FairRations.fairRations(arr1));
    }

    @Test
    void sumOfNumbersIsEven() {
        int[] arr = {1,3,4};
        Assertions.assertEquals("2", FairRations.fairRations(arr));
    }

    @Test
    void hackerrankTest() {
        int[] arr = {2,3,4,5,6};
        Assertions.assertEquals("4", FairRations.fairRations(arr));
    }

}