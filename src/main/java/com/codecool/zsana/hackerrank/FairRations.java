package com.codecool.zsana.hackerrank;

// Easy 25 points
public class FairRations {

    String url = "https://www.hackerrank.com/challenges/fair-rations/problem";

    static String fairRations(int[] B) {
        int sum = 0;
        for (int value : B) {
            sum += value;
        }
        if (sum % 2 == 1 || B.length == 0) {
            return "NO";
        }
        if (oddOrEvenOnly(B, 0)) {
            return "0";
        } else if (oddOrEvenOnly(B, 1)) {
            return String.valueOf(B.length);
        }
        int breadCounter = 0;
        while (!oddOrEvenOnly(B, 0)) {
            for (int i = 0; i < B.length-1; i++) {
                if (B[i] % 2 != 0) {
                    B[i] += 1;
                    B[i+1] += 1;
                    breadCounter += 2;
                }
            }
        }
        return String.valueOf(breadCounter);
    }

    public static boolean oddOrEvenOnly(int[] arr, int modulo) {
        for (int i : arr) {
            if (i % 2 != modulo) {
                return false;
            }
        }
        return true;
    }
}
