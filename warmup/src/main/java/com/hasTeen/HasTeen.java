package com.hasTeen;

import java.util.Scanner;

public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter a number");
        int b = in.nextInt();
        System.out.println("Enter a number");
        int c = in.nextInt();

        HasTeen obj = new HasTeen();
        System.out.println(obj.hasTeen(a,b,c));
    }
}
