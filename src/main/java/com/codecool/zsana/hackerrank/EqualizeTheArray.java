package com.codecool.zsana.hackerrank;

import java.util.HashMap;
import java.util.Map;

// Easy 20 points
public class EqualizeTheArray {

    String url = "https://www.hackerrank.com/challenges/equality-in-a-array/problem";

    static int equalizeArray(int[] arr) {
        Map<Integer, Integer> map = arrayToMap(arr);
        if (map.keySet().size() <= 1) {
            return 0;
        }
        int keyOfMaxValue = getKeyOfTheLargestValue(map);
        int toBeThrownOut = 0;
        for (int i : map.keySet()) {
            if (keyOfMaxValue != i) {
                toBeThrownOut += map.get(i);
            }
        }
        return toBeThrownOut;
    }

    public static Map<Integer, Integer> arrayToMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            if(!map.containsKey(i)) {
                map.put(i,1);
            }
            else {
                map.put(i, map.get(i)+1);
            }
        }
        return map;
    }

    public static int getKeyOfTheLargestValue(Map<Integer, Integer> map) {
        int max = 0;
        int key = 0;
        for (int i : map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
                key = i;
            }
        }
        return key;
    }
}
