package ru.netology.basic;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @org.testng.annotations.Test
    public void shouldAmountZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

}