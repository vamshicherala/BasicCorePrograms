package com;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        LeapYear l = new LeapYear();
        l.yearCheck();
    }
    void yearCheck(){
        int year;
        System.out.print("Enter valid Year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year%4==0||year%400==0||year%100==0){
            System.out.println(year+" is a Leap year");
        }else {
            System.out.println(year+" is not a Leap year");
        }
    }
}
