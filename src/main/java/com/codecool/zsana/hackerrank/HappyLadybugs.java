package com.codecool.zsana.hackerrank;

import java.util.HashMap;
import java.util.Map;

// Easy 30 points
class HappyLadybugs {

    String url = "https://www.hackerrank.com/challenges/happy-ladybugs/problem";

    static String happyLadybugs(String b) {
        char[] charB = b.toCharArray();
        if (!checkValues(arrayToMap(charB))) {
            return "NO";
        }
        if (checkNeighBours(charB)) {
            return "YES";
        } else if (checkUnderScore(arrayToMap(charB))) {
            return "YES";
        }
        return "NO";
    }

    private static Map<Character, Integer> arrayToMap(char[] arr) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        return map;
    }

    private static boolean checkValues(Map<Character, Integer> map) {
        for (Character c : map.keySet()) {
            if (c != '_' && map.get(c) < 2) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkUnderScore(Map<Character, Integer> map) {
        for (Character c : map.keySet()) {
            if (c == '_') {
                return true;
            }
        }
        return false;
    }

    private static boolean checkNeighBours(char[] c) {
        for (int i = 1; i < c.length-1; i++) {
            if (!(c[i-1] == c[i] || c[i+1] == c[i])) {
                return false;
            }
        }
        return true;
    }

}
