package com.codecool.zsana.hackerrank.first;

// Easy 20 points
class UtopianTree {

    String url = "https://www.hackerrank.com/challenges/utopian-tree/problem";

    static int utopianTree(int n) {
        int height = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                height = height*2;
            } else {
                height += 1;
            }
        }
        return height;
    }
}
