package com.functional;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a,b,c : ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double delta=b*b-4*a*c;
        double r = -b/2*a;
        double rootOfx1 =r+(Math.sqrt(delta));
        double rootOfx2 =r-(Math.sqrt(delta));
        System.out.println("The two roots are "+rootOfx1+" and "+rootOfx2);
    }
}
