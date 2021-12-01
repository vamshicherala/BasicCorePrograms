package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int power = 0;
        System.out.print("Enter the value of N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 31)
            System.out.println("Enter number less than 31");
        else
            power = (int) Math.pow(2,n);
        System.out.println("Power is: "+power);
    }
}
