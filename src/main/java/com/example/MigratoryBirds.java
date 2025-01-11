package com.example;

public class MigratoryBirds {
    public int BirdMigration(int[] arr){
        int count=0;
        int birdtype=0;
        
        for(int i=0;i<arr.length;i++){
            int cc=0;
           for(int j=0;j<arr.length;j++){
            if(arr[i] == arr[j]){
                cc++;
                
            }
           }
           if (cc > count || (cc == count && arr[i] < birdtype)) {
            count = cc;
            birdtype = arr[i];
        }
        }
        return birdtype;
    }
}
