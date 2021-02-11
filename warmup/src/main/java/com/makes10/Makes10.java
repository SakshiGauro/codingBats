package com.makes10;

import java.util.Scanner;

public class Makes10 {
    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || (a + b == 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter a number");
        int b = in.nextInt();

        Makes10 obj = new Makes10();
        System.out.println(obj.makes10(a,b));
    }
}
