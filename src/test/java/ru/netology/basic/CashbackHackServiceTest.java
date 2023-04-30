package ru.netology.basic;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {
    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldAmountZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testRemainWithCashback2() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void shouldAmountZero2() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
  
}

//@org.junit.Test