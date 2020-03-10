package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FlatlandSpaceStationsTest {

    @Test
    void emptyArray() {
        int[] arr = {};
        Assertions.assertEquals(0, FlatlandSpaceStations.flatlandSpaceStations(0, arr));
    }

    @Test
    void oneElementArray() {
        int[] arr = {0};
        Assertions.assertEquals(0, FlatlandSpaceStations.flatlandSpaceStations(1, arr));
    }

    @Test
    void onlyFirstCityHasStation() {
        int[] arr = {0};
        Assertions.assertEquals(5, FlatlandSpaceStations.flatlandSpaceStations(6, arr));
    }

    @Test
    void onlyLastCityHasStation() {
        int[] arr = {5};
        Assertions.assertEquals(5, FlatlandSpaceStations.flatlandSpaceStations(6, arr));
    }

    @Test
    void allCitiesHaveStations() {
        int[] arr = {0,1,2,3,4,5};
        Assertions.assertEquals(0, FlatlandSpaceStations.flatlandSpaceStations(6, arr));
    }

    @Test
    void someCitiesHaveStations() {
        int[] arr = {0,4,9};
        int[] arr1 = {4,10};
        Assertions.assertEquals(2, FlatlandSpaceStations.flatlandSpaceStations(10, arr));
        Assertions.assertEquals(4, FlatlandSpaceStations.flatlandSpaceStations(11, arr1));
    }

    @Test
    void hackerrankTest() {
        int[] arr = {13,1,11,10,6};
        Assertions.assertEquals(6, FlatlandSpaceStations.flatlandSpaceStations(20, arr));
    }

}