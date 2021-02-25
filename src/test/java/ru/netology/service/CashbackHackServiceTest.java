package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void IfWeNotPay() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    // судя по подсказке он должен упасть
    public void IfWeOverPay() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 11000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IfWeHalfPay() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 500;

        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IfWeAnyPay() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 340;

        int actual = cashbackHackService.remain(amount);
        int expected = 660;

        Assert.assertEquals(expected, actual);
    }
}