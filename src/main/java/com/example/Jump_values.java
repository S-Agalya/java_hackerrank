package com.example;

public class Jump_values {
    public String Kangaroo_jump(int x1,int v1,int x2,int v2){
        if(v1==v2 ){
           if(x1==x2){
            return "YES";
           }else{
            return "NO";
           }
        }else{
            if((x2-x1)/(v1-v2)>0){
                return "YES";
            }else{
                return "NO";
            }
        }
    }
}
