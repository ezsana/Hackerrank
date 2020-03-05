package com.codecool.zsana.hackerrank;

// Easy 30 points
class StrangeCounter {

    String url = "https://www.hackerrank.com/challenges/strange-code/problem";

    static long strangeCounter(long t) {
        long timer = 1;
        long counter = 3;
        while (timer <= t) {
            for (long i = counter; i >= 1; i--) {
                if (timer == t) {
                    return i;
                }
                timer++;
            }
            counter = counter*2;
        }
        return -1;
    }

}
