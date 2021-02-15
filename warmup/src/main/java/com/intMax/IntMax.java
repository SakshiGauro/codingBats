package com.intMax;

import java.util.Scanner;

public class IntMax {
    public int intMax(int a, int b, int c) {
        if(a > b && a > c)
            return a;
        else if(b > a && b > c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter a number");
        int b = in.nextInt();
        System.out.println("Enter a number");
        int c = in.nextInt();

        IntMax obj = new IntMax();
        System.out.println(obj.intMax(a,b,c));
    }
}
