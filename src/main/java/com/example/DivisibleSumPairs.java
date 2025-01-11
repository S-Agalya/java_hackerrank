package com.example;
public class DivisibleSumPairs {
    public int Divisblepaircount(int[]arr,int k){
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(sum%k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
