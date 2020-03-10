package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LisasWorkbookTest {

    @Test
    void problemsOnMorePagesInAChapter() {
        Assertions.assertEquals(3, LisasWorkbook.workbook(3, 2, new int[] {3,5,1}));
    }

    @Test
    void onePagePerChapter() {
        Assertions.assertEquals(4, LisasWorkbook.workbook(5, 6, new int[] {3,1,2,4,5,6}));
    }

    @Test
    void oneProblemPerPage() {
        Assertions.assertEquals(6, LisasWorkbook.workbook(3, 1, new int[] {6,2,11}));
    }

    @Test
    void hackerTest() {
        Assertions.assertEquals(4, LisasWorkbook.workbook(5, 3, new int[] {4,2,6,1,10}));
    }

    @Test
    void hackerTest2() {
        Assertions.assertEquals(11, LisasWorkbook.workbook(15, 20, new int[] {1,8,19,15,2,29,3,2,25,2,19,26,17,33,22}));
    }

}