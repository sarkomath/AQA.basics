package ru.netology.service;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void HalfPay() {
        int amount = 500;

        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void NoPay() {
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void OverPay() {
        int amount = 5600;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void AnyPay() {
        int amount = 520;

        int actual = cashbackHackService.remain(amount);
        int expected = 480;

        assertEquals(actual, expected);
    }
}