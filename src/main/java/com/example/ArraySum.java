package com.example;

public class ArraySum {
    int arraySum(int[] arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
}