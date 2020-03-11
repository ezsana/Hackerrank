package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtopianTreeTest {

    @Test
    void zeroCycle() {
        int cycle = 0;
        Assertions.assertEquals(1, UtopianTree.utopianTree(cycle));
    }

    @Test
    void oneCycle() {
        int cycle = 1;
        Assertions.assertEquals(2, UtopianTree.utopianTree(cycle));
    }

    @Test
    void twoCycle() {
        int cycle = 2;
        Assertions.assertEquals(3, UtopianTree.utopianTree(cycle));
    }

    @Test
    void evenNumberCycle() {
        int cycle = 12;
        Assertions.assertEquals(127, UtopianTree.utopianTree(cycle));
    }

    @Test
    void oddNumberCycle() {
        int cycle = 13;
        Assertions.assertEquals(254, UtopianTree.utopianTree(cycle));
    }

}