package com.codecool.zsana.hackerrank;

// Easy 15 points
public class ElectronicShop {

    String url = "https://www.hackerrank.com/challenges/electronics-shop/problem";

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        if (keyboards.length == 0 || drives.length == 0) {
            return -1;
        }
        int maxPrice = -1;
        for (int keyb : keyboards) {
            for (int dr : drives) {
                if (keyb + dr <= b && maxPrice < keyb + dr) {
                    maxPrice = keyb + dr;
                }
            }
        }
        return maxPrice;
    }

}
