package com.close10;

import java.util.Scanner;

public class Close10 {
    public int close10(int a, int b) {
        if(Math.abs(10 - a) < Math.abs(10 - b))
            return a;
        else if(Math.abs(10 - b) < Math.abs(10 - a))
            return b;
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter a number");
        int b = in.nextInt();

        Close10 obj = new Close10();
        System.out.println(obj.close10(a,b));
    }
}
