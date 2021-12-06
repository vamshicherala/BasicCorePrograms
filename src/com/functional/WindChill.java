package com.functional;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        System.out.print("Enter the values of temperature and wind speed: ");
        //input
        Scanner sc = new Scanner(System.in);
        double t =sc.nextDouble();
        double v = sc.nextDouble();
        //calculation
        if (t<=50 && v<=120 && v>=3) {
            double wind = Math.pow(v, 0.16);
            double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * wind;
            //output
            System.out.println("the wind chill is "+ w);
        }else {
            System.out.println("Enter tempurature below 50 and wind speed between 120-3");
        }
    }
}
