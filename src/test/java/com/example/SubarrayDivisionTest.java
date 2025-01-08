package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class SubarrayDivisionTest {
    @Test
    public void birthdayTest(){
        SubarrayDivision sd=new SubarrayDivision();
        int[] s={1,2,1,3,2};
        int d=3;
        int m=2;
        int res=sd.birthday(s, d, m);
        int expected=2;
        Assertions.assertEquals(expected, res);
    }
}
