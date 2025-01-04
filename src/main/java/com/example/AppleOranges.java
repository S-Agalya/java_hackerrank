package com.example;

public class AppleOranges {
   public static int[] AppleandOranges(int s,int t,int appletreeposition,int orangetreeposition,int[] no_of_apples,int[] no_of_oranges){
    int apples_in_house=0;
    int oranges_in_house=0;
    for(int i=0;i<no_of_apples.length;i++){
        int apples=no_of_apples[i];
        int appleposition=apples+appletreeposition;
        if(appleposition>=s && appleposition<=t){
            apples_in_house++;
        }
    }

    for(int j=0;j<no_of_oranges.length;j++){
        int oranges=no_of_oranges[j];
        int orangeposition=oranges+orangetreeposition;
        if(orangeposition>=s && orangeposition<=t){
            oranges_in_house++;
        }

    }
    return new int[] {apples_in_house,oranges_in_house};
   } 
}
