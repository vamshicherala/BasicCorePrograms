package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        if (n%2 == 0){
            System.out.println("Even number ");
        }else {
            System.out.println("Odd number");
        }

    }
}
