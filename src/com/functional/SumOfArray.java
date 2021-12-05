package com.functional;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={0,1,3,-5,-2,-1};
        int n=arr.length;
        sumOfArray(arr,n);
    }
    static void sumOfArray(int[] arr,int n){
        boolean found = false;
        for (int i=0;i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                for (int k=j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        System.out.print(arr[k]);
                        System.out.print(" ");
                        System.out.println(found=true);
                    }
                }
            }
        }
        if (found=false){
            System.out.println("does not exists");
            System.out.println(found);
        }
    }
}