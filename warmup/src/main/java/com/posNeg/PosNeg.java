package com.posNeg;

import java.util.Scanner;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if(negative)
            return (a < 0 && b < 0);
        return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter a number");
        int b = in.nextInt();
        System.out.println("Negative is: ");
        boolean neg = in.nextBoolean();

        PosNeg obj = new PosNeg();
        System.out.println(obj.posNeg(a,b, neg));
    }
}
