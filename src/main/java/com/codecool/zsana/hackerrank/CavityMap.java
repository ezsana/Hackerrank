package com.codecool.zsana.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Easy 30 points
public class CavityMap {

    String url = "https://www.hackerrank.com/challenges/cavity-map/problem";

    static String[] cavityMap(String[] grid) {
        int gridLength = grid.length;
        for (int i = 0; i < gridLength; i++) {
            if (grid[i].length() != gridLength) {
                return null;
            }
        }
        List<List<String>> k = numbersToDigits(grid);
        for (int i = 1; i < k.size() - 1; i++) {
            for (int y = 1; y < k.get(i).size() - 1; y++) {
                if (Integer.valueOf(k.get(i).get(y)) > Integer.valueOf(k.get(i - 1).get(y)) &&
                        Integer.valueOf(k.get(i).get(y)) > Integer.valueOf(k.get(i + 1).get(y)) &&
                        Integer.valueOf(k.get(i).get(y)) > Integer.valueOf(k.get(i).get(y - 1)) &&
                        Integer.valueOf(k.get(i).get(y)) > Integer.valueOf(k.get(i).get(y + 1))) {
                    k.get(i).set(y, "200");
                }
            }
        }
        String[] newS = new String[grid.length];
        for (int i = 0; i < k.size(); i++) {
            StringBuilder builder = new StringBuilder();
            for (int y = 0; y < k.get(i).size(); y++) {
                if (k.get(i).get(y).equals("200")) {
                    k.get(i).set(y, "X");
                }
                builder.append(k.get(i).get(y));
            }
            newS[i] = builder.toString();
        }
        return newS;
    }

    public static List<List<String>> numbersToDigits(String[] grid) {
        List<List<String>> l = new ArrayList<List<String>>();
        for (int i = 0; i < grid.length; i++) {
            l.add(Arrays.asList(grid[i].split("")));
        }
        return l;
    }
}