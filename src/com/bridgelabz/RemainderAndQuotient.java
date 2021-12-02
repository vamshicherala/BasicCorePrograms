package com.bridgelabz;

import java.util.Scanner;

public class RemainderAndQuotient {
    public static void main(String[] args) {
        int number,number1;
        System.out.print("enter the numbers to calculate: ");
        Scanner sc =new Scanner(System.in);
        number = sc.nextInt();
        number1 = sc.nextInt();
        int remainder = number%number1;
        int quotient = number/number1;
        System.out.println("Remainder is : "+remainder+ "  Quotient is : "+quotient);
    }
}
