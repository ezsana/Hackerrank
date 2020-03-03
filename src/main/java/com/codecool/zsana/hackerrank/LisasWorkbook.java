package com.codecool.zsana.hackerrank;

// Easy 25 points
class LisasWorkbook {

    String url = "https://www.hackerrank.com/challenges/lisa-workbook/problem";

    static int workbook(int numberOfChapters, int maxProblemsOnPage, int[] problemsInChapter) {
        int page = 1;
        int counter = 0;
        for (int c : problemsInChapter) {
            for (int i = 0; i < c; i++) {
                if (i+1 == page) {
                    counter++;
                }
                if ((i+1) % maxProblemsOnPage == 0) {
                    page++;
                } else if (i == c-1) {
                    page++;
                }
            }
        }
        return counter;
    }
}