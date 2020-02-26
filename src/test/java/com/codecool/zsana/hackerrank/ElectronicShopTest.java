package com.codecool.zsana.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ElectronicShopTest {

    @Test
    public void notEnoughMoney() {
        int[] keyboard = {3,4};
        int[] usb = {2,56,4};
        int money = 1;
        Assertions.assertEquals(-1, ElectronicShop.getMoneySpent(keyboard, usb, money));
    }

    @Test // Monica has to buy 2 items
    public void onlyOneItemIsAvailable() {
        int[] keyboard = {};
        int[] usb = {2,56,4};
        int money = 100;
        Assertions.assertEquals(-1, ElectronicShop.getMoneySpent(keyboard, usb, money));
    }

    @Test
    public void hasJustEnoughMoney() {
        int[] keyboard = {3,4};
        int[] usb = {2,56,4};
        int money = 60;
        Assertions.assertEquals(60, ElectronicShop.getMoneySpent(keyboard, usb, money));
    }

    @Test
    public void hasMoreThanEnoughMoney() {
        int[] keyboard = {3,4,10,12};
        int[] usb = {2,56,4};
        int money = 100;
        Assertions.assertEquals(68, ElectronicShop.getMoneySpent(keyboard, usb, money));
    }

}