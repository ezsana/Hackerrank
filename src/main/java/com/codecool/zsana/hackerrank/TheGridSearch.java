package com.codecool.zsana.hackerrank;

// Medium 30 points
public class TheGridSearch {

    String url = "https://www.hackerrank.com/challenges/the-grid-search/problem";

    static String gridSearch(String[] G, String[] P) {
        if ((P[0].length() > G[0].length()) || (P.length > G.length)) {
            return "NO";
        }
        int startFrom = 0;
        int subStart = 0;
        for (int i = 0; i < G.length-1; i++) {
            if (G[i].contains(P[0])) {
                startFrom = i;
                subStart = findString(G[i], P[0]);
                break;
            }
        }
        int index = 0;
        if (G[startFrom].substring(subStart).contains(arrayToString(P))) {
            return "YES";
        }
        System.out.println(G[startFrom].substring(subStart, subStart+P[index].length()-1));
        System.out.println(P[index]);
        while (index < P.length && G[startFrom].substring(subStart, subStart+P[index].length()).contains(P[index])) {
            startFrom++;
            index++;
        }
        return index == P.length ? "YES" : "NO";
    }

    private static String arrayToString(String[] s) {
        StringBuilder builder = new StringBuilder();
        for (String str : s) {
            builder.append(str);
        }
        return builder.toString();
    }

    private static int findString(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            int k = i;
            int j = 0;
            while (j < s2.length() && s1.charAt(i) == s2.charAt(j)) {
                j++;
                i++;
                if (j == s2.length()) {
                    return k;
                }
            }
            i = k;
        }
        return -1;
    }

}
