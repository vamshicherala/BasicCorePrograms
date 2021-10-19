package com.com.pow;

import java.util.Scanner;

public class Power {
    static void pow() {
        int value = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (0 <= n && n < 31) {
            for (int i = 0; i <= n; i++) {
                value = (int) Math.pow(2, n);
            }
            System.out.println("Power value is : " + value);
        } else {
            System.out.println("Value of integer Overflows Try to give less inputs");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        pow();
    }
}
