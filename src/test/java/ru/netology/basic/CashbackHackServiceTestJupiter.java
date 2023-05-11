package ru.netology.basic;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;
public class CashbackHackServiceTestJupiter {
    @org.junit.jupiter.api.Test
    public void testRemainJupiter() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @org.junit.jupiter.api.Test
    public void testRemain1Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 100;
        int actual = service.remain(amount);
        Assertions.assertEquals(actual, expected);
    }
    @org.junit.jupiter.api.Test
    public void testRemainWithCashbackJupiter() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @org.junit.jupiter.api.Test
    public void shouldAmountZeroJupiter() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}