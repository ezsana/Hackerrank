package com.codecool.zsana.hackerrank.first;

import java.util.Arrays;

// Easy 25 points
class FlatlandSpaceStations {

    String url = "https://www.hackerrank.com/challenges/flatland-space-stations/problem";

    static int flatlandSpaceStations(int n, int[] c) {
        if (n == 0 || n == c.length) {
            return 0;
        } else if (c.length == 1) {
            return n-1;
        }
        Arrays.sort(c);
        int maxDistance = c[0];
        for (int i = c.length-1; i >= 0; i--) {
            try {
                if (Math.ceil((c[i] - c[i-1])/2) > maxDistance) {
                    maxDistance = (int)Math.ceil((c[i] - c[i-1])/2);
                }
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println(a.toString());
            }

        }
        if (n-1 - c[c.length-1] < maxDistance) {
            return maxDistance;
        }
        return n-1 - c[c.length-1];
    }

}
