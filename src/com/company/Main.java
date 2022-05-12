package com.company;
import java.util.*;
public class Main {
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
            System.out.println("\n1)Display\n2)Reverse\n3)Maximum element\n4)Minimum\n");
            System.out.println("Enter your choice : ");
            ch = sc.nextInt();
            if(ch ==1) {
                System.out.print("\nDisplaying elements in array : ");
                for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
                }
            }
            else if(ch ==2){
                System.out.println("Displaying array in reverse order : ");
                for(int i=n-1;i>=0;i--){
                    System.out.print(arr[i]+" ");
                }
            }
            else if(ch ==3) {
                for (int i = 0; i < n-1; i++) {
                    for (int j = 0; j < n - i-1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }

                System.out.print("Maximum element is : "+arr[n - 1]);
                System.out.println("\nMinimum element is : "+arr[0]);
                System.out.println("For kth maximum element : ");
                int k = sc.nextInt();
                System.out.println(k+"th maximum element is : "+arr[n-k]);
                System.out.println("For kth minimum element : ");
                int ke = sc.nextInt();
                System.out.println(ke+"th minimum element is : "+arr[ke-1]);
            }
            else if(ch ==4){

            }
        }while(ch !=0);

    }
}
