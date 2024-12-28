package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class ArraySumTest {
    @Test
    void testArraySum(){
        ArraySum arraysum=new ArraySum();
      int[] arr={1,2,3,4,5};
      int res=arraysum.arraySum(arr, arr.length);
      assertEquals(15,res);
    }
}
