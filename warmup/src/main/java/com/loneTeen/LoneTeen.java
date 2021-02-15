package com.loneTeen;

import java.util.Scanner;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean aa = (a >= 13 && a <= 19);
        boolean bb = (b >= 13 && b <= 19);
        return (aa && !bb) || (!aa && bb);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter a number");
        int b = in.nextInt();

        LoneTeen obj = new LoneTeen();
        System.out.println(obj.loneTeen(a,b));
    }
}
