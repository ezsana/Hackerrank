package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HappyLadybugsTest {

    @Test
    void emptyString() {
        Assertions.assertEquals("YES", HappyLadybugs.happyLadybugs(""));
    }

    @Test
    void underScoresOnly() {
        Assertions.assertEquals("YES", HappyLadybugs.happyLadybugs(""));
    }

    @Test
    void oneLetterString() {
        Assertions.assertEquals("NO", HappyLadybugs.happyLadybugs("B"));
    }

    @Test
    void allBugsInSameColour() {
        String bugs = "GGG";
        String bugs1 = "G__GG";
        Assertions.assertEquals("YES", HappyLadybugs.happyLadybugs(bugs));
        Assertions.assertEquals("YES", HappyLadybugs.happyLadybugs(bugs1));
    }

    @Test
    void happyBugs() {
        String bugs = "Y_Y_B_B";
        String bugs1 = "B_B_RB_R";
        String bugs2 = "RR_GG";
        String bugs3 = "RRYYBB";
        Assertions.assertEquals("YES", HappyLadybugs.happyLadybugs(bugs));
        Assertions.assertEquals("YES", HappyLadybugs.happyLadybugs(bugs1));
        Assertions.assertEquals("YES", HappyLadybugs.happyLadybugs(bugs2));
        Assertions.assertEquals("YES", HappyLadybugs.happyLadybugs(bugs3));
    }

    @Test
    void notHappyBugs() {
        String bugs = "Y____B";
        String bugs1 = "_YB_RGR";
        Assertions.assertEquals("NO", HappyLadybugs.happyLadybugs(bugs));
        Assertions.assertEquals("NO", HappyLadybugs.happyLadybugs(bugs1));
    }

    @Test
    void hackerTests() {
        String bugs = "RBY_YBR";
        String bugs1 = "X_Y__X";
        String bugs2 = "B_RRBR";
        Assertions.assertEquals("YES", HappyLadybugs.happyLadybugs(bugs));
        Assertions.assertEquals("NO", HappyLadybugs.happyLadybugs(bugs1));
        Assertions.assertEquals("YES", HappyLadybugs.happyLadybugs(bugs2));
    }

}