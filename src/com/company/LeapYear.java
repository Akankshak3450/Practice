package com.company;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        int n =0;
        while(n<2001){
            if(n%4 ==0){
                System.out.println("Leap Year "+n);
            }
            n++;

        }
    }
}
