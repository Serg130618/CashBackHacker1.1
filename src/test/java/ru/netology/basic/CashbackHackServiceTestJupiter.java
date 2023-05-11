package ru.netology.basic;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTestJupiter {
    @Test
    public void testRemainJupiter() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void testRemain1Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void testRemainWithCashbackJupiter() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldAmountZeroJupiter() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}