package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class DivisibleSumPairTest {
    @Test
    public void  divisibleSumPairTest(){
        DivisibleSumPairs pairCount = new DivisibleSumPairs();
        int[] arr={1,3,2,6,1,2};
        int k=3;
        int res=pairCount.Divisblepaircount(arr, k);
        int expected=5;
        Assertions.assertEquals(expected, res);
    }
}
