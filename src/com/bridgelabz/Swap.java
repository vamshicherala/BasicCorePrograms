package com.bridgelabz;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int x,y,t;
        System.out.println("Enter the X and Y  to Swap :");
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        y=sc.nextInt();
        t=x;
        x=y;
        y=t;
        System.out.println("x="+x+" y="+y);
    }
}
