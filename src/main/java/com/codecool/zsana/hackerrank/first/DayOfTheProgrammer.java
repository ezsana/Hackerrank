package com.codecool.zsana.hackerrank.first;

// Easy 15 points
class DayOfTheProgrammer {

    String url = "https://www.hackerrank.com/challenges/day-of-the-programmer/problem";

    // Find the 256th day of the year

    static String dayOfProgrammer(int year) {
        if (year < 1700 || year > 2700) {
            return "Please specify year between 1700 and 2700.";
        }
        int[] monthAndDay = getMonthAndDay();
        if (monthAndDay.length != 0) {
            if (year == 1918) {
                return (monthAndDay[0] + 13) + ".0" + monthAndDay[1] + "." + year;
            }
            if (!isLeap(year)) {
                return monthAndDay[0] + ".0" + monthAndDay[1] + "." + year;
            } else if (isLeap(year)) {
                return (monthAndDay[0]-1) + ".0" + monthAndDay[1] + "." + year;
            }
        }
        return null;
    }

    private static int[] getMonthAndDay() {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       int dayOfProg = 256;
       for (int i = 0; i < daysInMonths.length; i++) {
           if (dayOfProg <= 0) {
               int[] monthAndDay = new int[2];
               monthAndDay[0] = dayOfProg + daysInMonths[i-1];
               monthAndDay[1] = i;
               return monthAndDay;
           }
           dayOfProg -= daysInMonths[i];
       }
       return new int[] {};
    }

    private static boolean isLeap(int year) {
        if (year < 1918) {
            return year % 4 == 0;
        } else if (year > 1918) {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }
        return false;
    }
}