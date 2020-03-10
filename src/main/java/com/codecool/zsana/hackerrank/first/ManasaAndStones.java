package com.codecool.zsana.hackerrank.first;

import java.util.*;

// Easy 30 points
class ManasaAndStones {

    String url = "https://www.hackerrank.com/challenges/manasa-and-stones/problem";

    static int[] stones(int stoneNumbers, int diff1, int diff2) {
        if (diff1 == diff2) {
            return new int[] {(stoneNumbers-1) * diff1};
        }
        Set<Integer> numbersOnStones = new HashSet<Integer>();
        numbersOnStones.add(diff1);
        numbersOnStones.add(diff2);
        for (int i = 1; i < stoneNumbers-1; i++) {
            Set<Integer> temp = new HashSet<Integer>();
            for (int s : numbersOnStones) {
                temp.add(s + diff1);
                temp.add(s + diff2);
            }
            numbersOnStones = temp;
        }
        return listToArray(sortSet(numbersOnStones));
    }

    private static int[] listToArray(List<Integer> list) {
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }
        return intArray;
    }

    private static List<Integer> sortSet(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<Integer>(set);
        Collections.sort(sortedList);
        return sortedList;
    }

}
