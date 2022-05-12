package com.company;
import java.util.Scanner;
public class RotationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("\nEnter elements in array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ch =0;
        do{
            System.out.println("Enter no. of turns : ");
            ch = sc.nextInt();
            int temp = arr[n-1];
            for(int i=n-1;i>=1;i--){
               arr[i] = arr[i-1];
            }
            arr[0] = temp;
            for(int i=0;i<n;i++) {
               System.out.print(arr[i] + " ");

            }
        }while(ch !=0);
    }

}
