package com.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
public class BirthdayCandlesTest {
    @Test
    public void TestBirthdayCandles(){
       BirthdayCandles candles=new BirthdayCandles();
       int[] input={1,3,2,3};
       int expected=2;
       int res=candles.MaxCandles(input, input.length);
       Assertions.assertEquals(expected, res);
    }
}
