package com.codecool.zsana.hackerrank.first;

import java.util.Collections;
import java.util.List;

// Easy 20 points
class PickingNumbers {

    String url = "https://www.hackerrank.com/challenges/picking-numbers/problem";

    static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int mainCounter = 0;
        for (int i = 0; i < a.size()-1; i++) {
            int counter = 0;
            for (int j = i+1; j < a.size(); j++) {
                if (a.get(j) - a.get(i) <= 1) {
                    counter++;
                } else {
                    break;
                }
            }
            if (mainCounter < counter) {
                mainCounter = counter;
            }
        }
        return mainCounter > 0 ? mainCounter+1 : 0;
    }

}
