package com.codecool.zsana.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PickingNumbersTest {

    @Test
    void twoElementArray() {
        List<Integer> list1 = Arrays.asList(2,3);
        List<Integer> list2 = Arrays.asList(2,4);
        Assertions.assertEquals(2, PickingNumbers.pickingNumbers(list1));
        Assertions.assertEquals(0, PickingNumbers.pickingNumbers(list2));
    }

    @Test
    void threeElementArray() {
        List<Integer> list1 = Arrays.asList(2,3,3);
        List<Integer> list2 = Arrays.asList(2,3,4);
        List<Integer> list3 = Arrays.asList(2,4,6);
        Assertions.assertEquals(3, PickingNumbers.pickingNumbers(list1));
        Assertions.assertEquals(2, PickingNumbers.pickingNumbers(list2));
        Assertions.assertEquals(0, PickingNumbers.pickingNumbers(list3));
    }

    @Test
    void fourElementArray() {
        List<Integer> list1 = Arrays.asList(2,2,3,3);
        List<Integer> list2 = Arrays.asList(2,3,4,5);
        List<Integer> list3 = Arrays.asList(2,3,3,4,5);
        Assertions.assertEquals(4, PickingNumbers.pickingNumbers(list1));
        Assertions.assertEquals(2, PickingNumbers.pickingNumbers(list2));
        Assertions.assertEquals(3, PickingNumbers.pickingNumbers(list3));
    }

}