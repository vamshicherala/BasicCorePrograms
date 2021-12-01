package com.bridgelabz;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    int tails=0;
    int heads=0;
    public static void main(String[] args) {
        CoinFlip coinFlip = new CoinFlip();
        coinFlip.flip();
    }

    void flip() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of time t Flip coin: ");
        int noOfTimes = sc.nextInt();
        for (int i = 0; i < noOfTimes; i++) {
            Random rand = new Random();
            double coin = rand.nextDouble();
            if (coin<0.5)
                tails++;
            else
                heads++;

        }
        int percentageOfHeads = (heads*100)/noOfTimes;
        int percentageOfTails = (tails*100)/noOfTimes;
        System.out.println("Percentage of heads: "+percentageOfHeads);
        System.out.println("Percentage of tails: "+percentageOfTails);
    }
}