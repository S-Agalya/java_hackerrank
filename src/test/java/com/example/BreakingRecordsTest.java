package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class BreakingRecordsTest {
    @Test
    public void breakingRecordsTest(){
        BreakingRecords records=new BreakingRecords();
        int[] scores={10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] expected={2,4};
        int[] res=records.breakingRecords(scores);
        Assertions.assertArrayEquals(expected, res);
    }
}
