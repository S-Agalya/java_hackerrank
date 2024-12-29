package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ArraySumTest {

    @Test
    public void testArraySum() {
        ArraySum arraysum = new ArraySum();
        int[] arr = {1, 2, 3, 4, 5};
        int res = arraysum.arraySum(arr, arr.length);

        // Corrected assertion
        Assertions.assertEquals(15, res, "The sum of the array elements is incorrect.");
    }
}

// hi welcome