package com.nearHundred;

import java.util.Scanner;

public class NearHundred {
    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10 || (Math.abs(200 - n) <= 10));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        NearHundred obj = new NearHundred();
        System.out.println(obj.nearHundred(num));
    }
}
