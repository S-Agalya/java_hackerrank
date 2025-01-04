package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class ApplesOrangesTest {
    @Test
    public void appleOrangeTest(){
        AppleOranges fruits= new AppleOranges();
        int s=7;
        int t=10;
        int a=5;
        int b=15;
        int[] apples={-2,2,1};
        int[] oranges={5,-6};

        int[] expected={1,1};
        int[] res=fruits.AppleandOranges(s, t, t, a, apples, oranges);
        Assertions.assertArrayEquals(expected, res);
    }
}
