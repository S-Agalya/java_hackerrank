package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class GradingStudentsTest {
  @Test
  public void testGradingStudents(){
    GradingStudents grade=new GradingStudents();
    int[] input={73,33,77,29};
    int[] expected={75,33,77,29};
    int[] result=grade.gradeMarks(input);
    Assertions.assertArrayEquals(expected, result);
  }  
}
