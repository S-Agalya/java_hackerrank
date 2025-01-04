package com.example;



public class GradingStudents {
    public int[] gradeMarks(int[] arr){
        int[] finalgrade=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int grade=arr[i];
            if(grade<38){
              finalgrade[i]=grade;
            }
            else{
                int fivemultiple=((grade/5)+1)*5;
                int diff=fivemultiple-grade;
                if(diff<3){
                    grade=fivemultiple;
                }
                finalgrade[i]=grade;
            }
        }
        return finalgrade;
    }
}
