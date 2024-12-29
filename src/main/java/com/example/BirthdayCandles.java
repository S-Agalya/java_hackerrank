package com.example;

public class BirthdayCandles {
   int MaxCandles(int[] arr,int n){
      int largest=arr[0];
      for(int i=1;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
      }
      int count=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==largest){
            count++;
        }
      }
      return count;
    }
     
}
