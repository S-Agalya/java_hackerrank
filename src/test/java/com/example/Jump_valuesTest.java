package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class Jump_valuesTest {
    @Test
    public void jumpvalueTest(){
        Jump_values jump=new Jump_values();
        int x1=21;
        int v1=6;
        int x2=47;
        int v2=3;
        String expected="NO";
        String res=jump.Kangaroo_jump(x1, v1, x2, v2);
        Assertions.assertEquals(expected, res);
    }
}
