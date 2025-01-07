package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class BetweenTheSetsTest {
    @Test
    public void  betweenSetsTest(){
        //create an obj
       BetweenTheSets LcmGcd = new BetweenTheSets();
       int[] a={2,4};
       int[] b={16,32,96};
       int expected=3;
       int res=LcmGcd.lcmAndGcd(a, b);
       Assertions.assertEquals(expected, res);
    }
}
