package com.company;

import java.util.Scanner;

public class LargestSumContiguosSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("\nEnter elements in array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0]+arr[1];
        for(int i=1;i<n-1;i++){
            int res = arr[i]+arr[i+1];
            if(max<res){
                max = res;
               int[] sub = new int[]{i, i + 1};

            }
            System.out.println("["+arr[i]+" "+arr[i+1]+"]");
        }
        System.out.println("Maximum sum of Sub-array is : "+max);

    }
}