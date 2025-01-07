package com.example;
public class BetweenTheSets {
    public static int lcmAndGcd(int[] a,int[] b){
        int lcmvalue=a[0];
        for(int i=1;i<a.length;i++){
            lcmvalue=findLcm(lcmvalue, a[i]);
        }

        int gcdvalue=b[0];
        for(int i=1;i<b.length;i++){
            gcdvalue=findGcd(gcdvalue, b[i]);
        }
        int count=0;
        for(int i=lcmvalue;i<=gcdvalue;i+=lcmvalue){
            if(gcdvalue%i == 0){
                count++;
            }
        }
        return count;
        }
        public static int findGcd(int a,int b){
            while(b != 0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            return a;
    }
    public static int findLcm(int a,int b){
        return a*(b/findGcd(a, b));
    }

}