package ru.netology.basic;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {
    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void shouldAmountZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
  
}