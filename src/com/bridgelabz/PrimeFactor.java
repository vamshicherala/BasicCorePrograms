package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for (int i=2;i<number;i++){
            while (number%i==0){
                System.out.println(i+" ");
                number=number/i;
            }
            if (number>2) {
                System.out.println(number);
            }
        }
    }
}
