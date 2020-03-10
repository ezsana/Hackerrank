package com.codecool.zsana.hackerrank;

// Easy 15 points
class TimeConversion {

    String url = "https://www.hackerrank.com/challenges/time-conversion/problem";

    static String timeConversion(String s) {
        int hours = Integer.valueOf(s.substring(0, 2));
        String mins = s.substring(3,5);
        String seconds = s.substring(6,8);
        String amPm = s.substring(8);
        if (amPm.equals("AM")) {
            if (hours == 12) {
                return "00:" + mins + ":" + seconds;
            }
            return s.substring(0, 8);
        } else {
            if (hours == 12) {
                return "12:" + mins + ":" + seconds;
            }
            return (12+hours) + ":" + mins + ":" + seconds;
        }
    }

}
