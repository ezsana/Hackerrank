package com.codecool.zsana.hackerrank;

// Easy 25 points
class TaumAndBday {

    String url = "https://www.hackerrank.com/challenges/taum-and-bday/problem";

    static long taumBday(long b, long w, long bc, long wc, long z) {
        if (z == 0) {
            return bc >= w ? wc*(b+w) : bc*(b+w);
        }
        if (bc > wc+z) {
            return (b+w)*wc + b*z;
        } else if (wc > bc+z) {
            return (b+w)*bc + w*z;
        }
        return b*bc + w*wc;
    }

}
