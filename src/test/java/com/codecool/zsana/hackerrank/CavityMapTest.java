package com.codecool.zsana.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CavityMapTest {

    @Test
    public void matrixIsNotSquare() {
        String[] grid = {"12"};
        String[] grid1 = {"123", "456", "33"};
        Assertions.assertNull(CavityMap.cavityMap(grid));
        Assertions.assertNull(CavityMap.cavityMap(grid1));
    }

    @Test
    public void matrixConsistsFromOneCell() {
        String[] grid = {"2"};
        Assertions.assertArrayEquals(grid, CavityMap.cavityMap(grid));
    }

    @Test // four cells
    public void onlyBorderNumbers() {
        String[] grid = {"56", "12"};
        Assertions.assertArrayEquals(grid, CavityMap.cavityMap(grid));
    }

    @Test
    public void borderNumberIsTheLargest() {
        String[] grid = {"764", "589", "322"};
        Assertions.assertArrayEquals(grid, CavityMap.cavityMap(grid));
    }

    @Test
    public void adjacentNumbersTheLargest() {
        String[] grid = {"1234", "1885", "2315", "3657"};
        Assertions.assertArrayEquals(grid, CavityMap.cavityMap(grid));
    }

    @Test
    public void hackerTest() {
        String[] map = {"1112", "1912", "1892", "1234"};
        String[] grid = {"1112", "1X12", "18X2", "1234"};
        Assertions.assertArrayEquals(grid, CavityMap.cavityMap(map));
    }

    @Test
    public void hackerTest2() {
        String[] map = {"179443854", "961621369", "164139922", "968633951", "812882578", "257829163", "812438597", "176656233", "485773814"};
        String[] grid = {"179443854", "961X21369", "164139922", "96X633951", "812882578", "25782X163", "8124385X7", "176656233", "485773814"};
        Assertions.assertArrayEquals(grid, CavityMap.cavityMap(map));
    }

}