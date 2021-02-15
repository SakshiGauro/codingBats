package com.in1020;

import java.util.Scanner;

public class In1020 {
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) ||(b >= 10 && b <= 20);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter a number");
        int b = in.nextInt();

        In1020 obj = new In1020();
        System.out.println(obj.in1020(a,b));
    }
}
