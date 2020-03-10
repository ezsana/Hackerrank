package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChocolateFeastTest {

    @Test
    void lessMoneyThanChocolatePrice() {
        Assertions.assertEquals(0, ChocolateFeast.chocolateFeast(1, 5, 2));
    }

    @Test
    void moreWrapperNeededThanBobbyHas() {
        Assertions.assertEquals(2, ChocolateFeast.chocolateFeast(2, 1, 3));
    }

    @Test // Happy path
    void canTurnInWrapperToBars() {
        Assertions.assertEquals(3, ChocolateFeast.chocolateFeast(5, 2, 2));
        Assertions.assertEquals(9, ChocolateFeast.chocolateFeast(15, 3, 2));
        Assertions.assertEquals(6, ChocolateFeast.chocolateFeast(10, 2, 5));
        Assertions.assertEquals(3, ChocolateFeast.chocolateFeast(12, 4, 4));
        Assertions.assertEquals(5, ChocolateFeast.chocolateFeast(6, 2, 2));
        Assertions.assertEquals(136, ChocolateFeast.chocolateFeast(16809, 123, 11668));
    }

}
