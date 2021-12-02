package com.bridgelabz;

import java.util.Locale;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        String ch;
        int vowels=0,consonents=0;
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        ch = sc.next();
        ch=ch.toLowerCase(Locale.ROOT);
        for (int i=0;i<ch.length();i++)
        if (ch.charAt(i)=='a' ||ch.charAt(i) =='e'||ch.charAt(i)=='i'||ch.charAt(i)=='o'||ch.charAt(i)=='u')
            vowels++;
        else
            consonents++;
        System.out.println(vowels+"  "+ consonents);
    }
}
