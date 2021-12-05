package com.functional;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter (x,y) co-ordinates to calculate: ");
        int x=sc.nextInt();
        int y = sc.nextInt();
        //to compute distance
        double distance = Math.sqrt(x*x+y*y);
        //output
        System.out.println("distance is "+distance);
    }
}
