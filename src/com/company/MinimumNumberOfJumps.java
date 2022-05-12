package com.company;
import java.util.*;
public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter data for array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        minJumps(arr);
    }
    static int minJumps(int[] arr){
        int n =arr.length;
        if(n ==1){
            return 0;
        }
        if(arr[0] ==0){
            return -1;
        }
        int steps = arr[0];
        int maxreach = arr[0];
        int jumps =1;
        for(int i=1;i<n;i++){
            if(i==n-1){
                return jumps;
            }
            maxreach = Math.max(maxreach,i+arr[i]);
            steps--;
            if(steps ==0){
                jumps++;
                if(i>=maxreach){
                    return -1;
                }
                steps = maxreach-i;
            }
        }
        return -1;
    }
}