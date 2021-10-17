package com.bridge;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static int heads = 0;
    public static int tails = 0;
    public static void main(String[] args) {
        CoinFlip m = new CoinFlip();
        m.flip();
    }
    public static void flip(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of times to flip a coin: ");
        int noOfTimes = sc.nextInt();
        for (int i=0;i<noOfTimes;i++){
            Random r = new Random();
            double coin = r.nextDouble();
            if (coin < 0.5){
                tails++;
            }else {
                heads++;
            }
        }
        double percentageOfHeads = ((heads*100)/noOfTimes);
        double percentageOfTails = ((tails*100)/noOfTimes);
        System.out.println("No of Heads: "+heads+" and"+"Heads percentage: "+percentageOfHeads);
        System.out.println("No of Tails: "+tails+" and"+"Tails percentage: "+percentageOfTails);
    }
}
