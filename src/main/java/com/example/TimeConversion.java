package com.example;

public class TimeConversion {
    String timeConversion(String s){
       String period=s.substring(s.length()-2);
       String hour=s.substring(0,2);
       String minutesecond=s.substring(2,s.length()-2);

       int hourint=Integer.parseInt(hour);
       if(period.equals("AM")){
        if(hourint==12){
            hourint=0;
        }
       }else{
        if(hourint != 12){
            hourint += 12;
        }
       }
       String newHour = String.format("%02d", hourint);
       return newHour+minutesecond;
    }
}
