package com.codecool.zsana.hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Easy 20 points
public class BigSorting {

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
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return intToStringArray(list);
    }

    static List<BigInteger> stringToBigIntList(String[] s) {
        List<BigInteger> numbers = new ArrayList<BigInteger>();
        for (int i = 0; i < s.length; i++) {
            BigInteger b = new BigInteger(s[i]);
            numbers.add(b);
        }
        return numbers;
    }

    static String[] intToStringArray(List<BigInteger> l) {
        String[] s = new String[l.size()];
        for (int i = 0; i < l.size(); i++) {
            s[i] = String.valueOf(l.get(i));
        }
        return s;
    }
}