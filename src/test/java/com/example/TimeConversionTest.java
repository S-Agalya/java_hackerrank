package com.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
public class TimeConversionTest {
    @Test
    public void testConversion(){
        //create a obj
        TimeConversion conversion=new TimeConversion();
        String s="01:05:45PM";
        //call the function using the obj name
        String res=conversion.timeConversion(s);
        Assertions.assertEquals("13:05:45", res);

    }
}
