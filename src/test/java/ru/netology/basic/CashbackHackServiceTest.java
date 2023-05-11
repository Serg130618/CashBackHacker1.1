package ru.netology.basic;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {
    @Test
    public void testRemainVintage() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
//    @Test
//    public void testRemain1Vintage() {
//        CashbackHackService service = new CashbackHackService();
//
//        int amount = 1000;
//        int expected = 100;
//        int actual = service.remain(amount);
//        assertEquals(actual, expected);
//    }
    @Test
    public void testRemainWithCashbackVintage() {
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



}