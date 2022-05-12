package com.company;
import java.util.*;
public class MinimizeTheHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n = sc.nextInt();
        System.out.println("Enter the number : ");
        int k =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter data for array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]-k>0){
                arr[i] = arr[i]-k;
            }else if(arr[i]-k<=0){
                arr[i] =arr[i]+k;
            }
        }
        System.out.println("Updated array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
        int max =arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int min =arr[0];
        for (int i = 0; i < n; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimized height of towers : "+(max-min));

    }
}
