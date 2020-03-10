package com.codecool.zsana.hackerrank.first;

// easy 25 points
class ChocolateFeast {

    String url = "https://www.hackerrank.com/challenges/chocolate-feast/problem";

    static int chocolateFeast(int n, int c, int m) {
        if (c > n) {
            return 0;
        }
        if (n / c < m) {
            return n/c;
        }
        int chocolates = n / c;
        int wrappers = chocolates;
        while (wrappers > 1) {
            chocolates += wrappers / m; // pl 2 db wrapper
            wrappers = wrappers / m + wrappers % m;
        }
        return chocolates;
    }

}
