package com.codecool.zsana.hackerrank.first;

import java.util.HashMap;
import java.util.Map;

// Medium 25 points
class TheTimeInWords {

    String url = "https://www.hackerrank.com/challenges/the-time-in-words/problem";

    static String timeInWords(int h, int m) {
        Map<Integer, String> hourAndMin = writtenMinutes();
        if (m == 0) {
            return hourAndMin.get(h) + " o' clock";
        }
        if (m < 30) {
            if (m == 15) {
                return hourAndMin.get(m) + " past " + hourAndMin.get(h);
            } else if (m == 1) {
                return hourAndMin.get(m) + " minute past " + hourAndMin.get(h);
            }
            return hourAndMin.get(m) + " minutes past " + hourAndMin.get(h);
        } else if ( m == 30) {
            return hourAndMin.get(m) + " past " + hourAndMin.get(h);
        } else {
            if (60-m == 15) {
                return hourAndMin.get(60-m) + " to " + hourAndMin.get(h+1);
            } else if (60-m == 1) {
                return hourAndMin.get(60-m) + " minute to " + hourAndMin.get(h+1);
            }
        }
        return hourAndMin.get(60-m) + " minutes to " + hourAndMin.get(h+1);
    }

    private static Map<Integer, String> writtenMinutes() {
        Map<Integer, String> minutes = new HashMap<Integer, String>();
        minutes.put(1, "one");
        minutes.put(2, "two");
        minutes.put(3, "three");
        minutes.put(4, "four");
        minutes.put(5, "five");
        minutes.put(6, "six");
        minutes.put(7, "seven");
        minutes.put(8, "eight");
        minutes.put(9, "nine");
        minutes.put(10, "ten");
        minutes.put(11, "eleven");
        minutes.put(12, "twelve");
        minutes.put(13, "thirteen");
        minutes.put(14, "fourteen");
        minutes.put(15, "quarter");
        minutes.put(16, "sixteen");
        minutes.put(17, "seventeen");
        minutes.put(18, "eighteen");
        minutes.put(19, "nineteen");
        minutes.put(20, "twenty");
        minutes.put(21, "twenty one");
        minutes.put(22, "twenty two");
        minutes.put(23, "twenty three");
        minutes.put(24, "twenty four");
        minutes.put(25, "twenty five");
        minutes.put(26, "twenty six");
        minutes.put(27, "twenty seven");
        minutes.put(28, "twenty eight");
        minutes.put(29, "twenty nine");
        minutes.put(30, "half");
        return minutes;
    }

}
