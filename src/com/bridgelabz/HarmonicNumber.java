package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.print("enter the value of N to calculate the Harmonic value : ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sum =0;
        for (double i=1;i<=n;i++){
            sum = sum + (1/i);
        }
        System.out.println("The Harmonic number is : "+sum);
    }
}
