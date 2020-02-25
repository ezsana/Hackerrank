package com.codecool.zsana.hackerrank;

import java.util.Arrays;

// Easy 20 points
public class DesignerPDFViewer {

    String url = "https://www.hackerrank.com/challenges/designer-pdf-viewer/problem";

    static int designerPdfViewer(int[] h, String word) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int wordLength = word.length();
        char[] tempArray = word.toCharArray();
        Arrays.sort(tempArray);
        int max = 0;
        for (int i = 0; i < wordLength; i++) {
            for (int y = 0; y < abc.length(); y++) {
                if (Character.toLowerCase(tempArray[i]) == abc.charAt(y)) {
                    if (h[y] > max) {
                        max = h[y];
                    }
                }
            }
        }
        return max * wordLength;
    }

}