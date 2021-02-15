package com.lastDigit;

import java.util.Scanner;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter a number");
        int b = in.nextInt();

        LastDigit obj = new LastDigit();
        System.out.println(obj.lastDigit(a,b));
    }
}
