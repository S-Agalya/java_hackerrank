package com.example;

public class MinMaxum {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static int[] MinMaxsum(int[] arr){
        bubbleSort(arr);
        int minvalue=arr[0];
        int maxvalue=arr[arr.length-1];
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum += arr[i];
        }
        int minimum=totalsum-maxvalue;
        int maximum=totalsum-minvalue;
        return new int[] {minimum, maximum};
    }
}

