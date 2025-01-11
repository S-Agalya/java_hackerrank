package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class MigrationBirdsTest {
    @Test
    public void migrationtest(){
        MigratoryBirds birds= new MigratoryBirds();
        int[] arr={1,4,4,4,5,3};
        int res=birds.BirdMigration(arr);
        int expected=4;
        Assertions.assertEquals(expected, res);
    }
}
