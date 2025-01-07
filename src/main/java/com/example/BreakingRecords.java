package com.example;

public class BreakingRecords {
    public int[] breakingRecords(int[] scores){
    int lowestvaluecount=0;
    int highestvaluecount=0;
    int highestvalue=scores[0];
    int lowestvalue=scores[0];
    for(int i=1;i<scores.length;i++){
        if(highestvalue<scores[i]){
            highestvalue=scores[i];
            highestvaluecount++;
        }else if(lowestvalue>scores[i]){
            lowestvalue=scores[i];
            lowestvaluecount++;
        }
    }
    return new int[] {highestvaluecount,lowestvaluecount};
    }
    
}
