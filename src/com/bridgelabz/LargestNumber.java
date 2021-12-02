package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter the value of a ,b ,c: ");
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a>b||a>c)
            System.out.println(a+" is the largest");
        else if (b>a||b>c)
            System.out.println(b+" is the largest");
        else
            System.out.println(c+" is the largest");

    }
}
