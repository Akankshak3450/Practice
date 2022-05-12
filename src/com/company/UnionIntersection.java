package com.company;
import java.util.*;
public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1 : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter elements in array1 : ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of array2 : ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n1];
        int arr3[] =new int[15];
        System.out.println("Enter elements in array2 : ");
        for (int i = 0; i < n1; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("UNION OF THE ARRAY : ");
        for(int i=0;i<n1;i++){
            arr3[i] = arr1[i];
        }
        for(int i=0;i<n1;i++){
            System.out.print(arr3[i]+" ");
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr2 != arr1)
                   arr3[n1+i] = arr2[j];
                System.out.print(arr3[n1+i]+" ");
            }
            break;
        }
        System.out.print("\nFOR INTERSECTION OF THE ARRAY :");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }

    }
}
