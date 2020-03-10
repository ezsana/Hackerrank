package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TheGridSearchTest {

    @Test
    void pStringLongerThanGString() {
        String[] g = {"111", "222", "333"};
        String[] p = {"1111", "2222", "3333"};
        Assertions.assertEquals("NO", TheGridSearch.gridSearch(g, p));
    }

    @Test
    void pLongerThanG() {
        String[] g = {"111", "222", "333"};
        String[] p = {"111", "222", "333", "444"};
        Assertions.assertEquals("NO", TheGridSearch.gridSearch(g, p));
    }

    @Test
    void gContainsP() {
        String[] g = {"555", "111", "222", "333", "444", "666"};
        String[] p = {"111", "222", "333", "444"};
        Assertions.assertEquals("YES", TheGridSearch.gridSearch(g, p));
    }

    @Test
    void gNotContainsP() {
        String[] g = {"555", "111", "222", "333", "444", "666"};
        String[] p = {"111", "222", "555", "444"};
        Assertions.assertEquals("NO", TheGridSearch.gridSearch(g, p));
    }

    @Test
    void hackerTest() {
        String[] g = {"123412", "561212", "123634", "781288"};
        String[] p = {"12", "34"};
        Assertions.assertEquals("YES", TheGridSearch.gridSearch(g, p));
    }

    @Test
    void hackerTest2() {
        String[] g = {"1234", "4321", "9999", "9999"};
        String[] p = {"12", "21"};
        Assertions.assertEquals("NO", TheGridSearch.gridSearch(g, p));
    }

    @Test
    void hackerTest3() {
        String[] g = {"7283455864", "6731158619", "8988242643", "3830589324", "2229505813", "5633845374", "6473530293", "7053106601", "0834282956", "4607924137"};
        String[] p = {"9505", "3845","3530"};
        Assertions.assertEquals("YES", TheGridSearch.gridSearch(g, p));
    }

    @Test
    void hackerTest4() {
        String[] g = {"111111111111111", "111111111111111", "111111111111111", "111111011111111", "111111111111111", "111111111111111", "101010101010101"};
        String[] p = {"11111", "11111", "11111", "11110"};
        Assertions.assertEquals("YES", TheGridSearch.gridSearch(g, p));
    }
}