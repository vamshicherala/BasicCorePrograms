package com.functional;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colmn = sc.nextInt();
        int[][] numbers = new int[rows][colmn];
        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //column
            for (int j = 0; j < colmn; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        //output
        //rows
        for (int i = 0; i < rows; i++) {
            //column
            for (int j = 0; j < colmn; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
