package com.codecool.zsana.hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Easy 20 points
class BigSorting {

    String url = "https://www.hackerrank.com/challenges/big-sorting/problem";

    static String[] bigSorting(String[] unsorted) {
        for (String no : unsorted) {
            try {
                BigInteger n = new BigInteger(no);
                if (n.compareTo(BigInteger.valueOf(0)) < 1) {
                    return null;
                }
            } catch (NumberFormatException nf) {
                return null;
            }
        }
        List<BigInteger> list = stringToBigIntList(unsorted);
        Collections.sort(list);
        for (BigInteger bigInteger : list) {
            System.out.println(bigInteger);
        }
        return intToStringArray(list);
    }

    private static List<BigInteger> stringToBigIntList(String[] s) {
        List<BigInteger> numbers = new ArrayList<BigInteger>();
        for (String value : s) {
            BigInteger b = new BigInteger(value);
            numbers.add(b);
        }
        return numbers;
    }

    private static String[] intToStringArray(List<BigInteger> l) {
        String[] s = new String[l.size()];
        for (int i = 0; i < l.size(); i++) {
            s[i] = String.valueOf(l.get(i));
        }
        return s;
    }
}