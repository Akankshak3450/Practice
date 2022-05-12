package com.company;
import java.util.Scanner;
public class NegativeElementsToOneSideOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("\nEnter elements in array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i] <0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
        System.out.println("Printing negative elements to one side of array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
