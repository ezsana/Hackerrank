package com.codecool.zsana.hackerrank;

import java.util.*;

// Easy 25 points
public class CutTheSticks {

    String url = "https://www.hackerrank.com/challenges/cut-the-sticks/problem";

    static int[] cutTheSticks(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int arrLength = arr.length;
        List<Integer> arrList = arrayToList(arr);
        List<Integer> cuts = new ArrayList<Integer>();
        while (arrLength >= 1) {
            int min = smallest(arrList);
            cuts.add(arrLength);
            Iterator itr = arrList.iterator();
            while (itr.hasNext()) {
                int x = (Integer)itr.next();
                if (x == min)
                    itr.remove();
            }
            arrLength = arrList.size();
        }

        return listToArray(cuts);
    }

    public static int smallest(List<Integer> list) {
        int min = list.get(0);
        for (int a : list) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    public static List<Integer> arrayToList(int[] arr) {
        List<Integer> l = new ArrayList<Integer>();
        for (int a : arr) {
            l.add(a);
        }
        return l;
    }

    public static int[] listToArray(List<Integer> l) {
        int[] arr = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            arr[i] = l.get(i);
        }
        return arr;
    }

}