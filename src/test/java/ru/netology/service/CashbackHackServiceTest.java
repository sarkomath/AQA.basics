package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void IfWeNotPay() {

        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    // судя по подсказке он должен упасть
    public void IfWeOverPay() {

        int amount = 11000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IfWeHalfPay() {

        int amount = 500;

        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IfWeAnyPay() {

        int amount = 340;

        int actual = cashbackHackService.remain(amount);
        int expected = 660;

        Assert.assertEquals(expected, actual);
    }
}