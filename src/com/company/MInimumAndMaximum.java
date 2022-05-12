package com.company;

import java.util.Scanner;

public class MInimumAndMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("\nEnter elements in array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min =arr[0];
        for (int i = 0; i < n; i++) {
             if(min>arr[i]){
                 min = arr[i];
             }
        }
        System.out.println("Minimum element is : "+min);
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max =arr[i];
            }
        }
        System.out.println("Maximum element is : "+max);
    }

}
