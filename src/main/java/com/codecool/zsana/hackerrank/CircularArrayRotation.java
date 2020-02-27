package com.codecool.zsana.hackerrank;

// Easy 20 points
class CircularArrayRotation {

    String url = "https://www.hackerrank.com/challenges/circular-array-rotation/problem";

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        if (a.length == 0) {
            return null;
        } else if (a.length == 1) {
            return a;
        }
        for (int i = 1; i <= k; i++) {
            int[] newArr = new int[a.length];
            for (int y = 1; y < a.length; y++) {
                newArr[0] = a[a.length-1];
                newArr[y] = a[y-1];
            }
            a = newArr;
        }
        int[] indicesValues = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            indicesValues[i] = a[queries[i]];
        }
        return indicesValues;
    }

}
