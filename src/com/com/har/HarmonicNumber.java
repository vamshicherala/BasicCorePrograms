package com.com.har;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        double n = 0;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (double i=1;i<=n;i++){
            sum = sum+(1/i);
        }
        System.out.println("Harmonic value is : "+sum);
    }


}