package com.codecool.zsana.hackerrank;

import java.util.Arrays;

// Easy 25 points
public class FindDigits {

    String url = "https://www.hackerrank.com/challenges/find-digits/problem";

    static int findDigits(int n) {
        int[] digits = getDigits(n);
        int countDividers = 0;
        for (int i : digits) {
            try {
                if (n % i == 0) {
                    countDividers++;
                }
            } catch (ArithmeticException ar) {}
        }
        return countDividers;
    }

    public static int[] getDigits(int number) {
        String num = String.valueOf(number);
        int[] numbers = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            numbers[i] = Integer.valueOf(String.valueOf(num.charAt(i)));
        }
        return numbers;
    }
}
