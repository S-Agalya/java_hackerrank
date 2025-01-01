package com.example;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Assertions;
public class MinMaxSumTest {
    @Test
    public void testMinMaxSum(){
       MinMaxum sum=new MinMaxum();
       int[] arr={1,2,3,4,5};
       int[] expected={10,14};
       int[] result = sum.MinMaxsum(arr);
       Assertions.assertArrayEquals(expected, result);
    }
}
