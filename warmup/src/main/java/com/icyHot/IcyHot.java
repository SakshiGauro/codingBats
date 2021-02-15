package com.icyHot;

import java.util.Scanner;

public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 >100) ||(temp1 > 100 && temp2 < 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a temperature");
        int a = in.nextInt();
        System.out.println("Enter a temperature");
        int b = in.nextInt();

        IcyHot obj = new IcyHot();
        System.out.println(obj.icyHot(a,b));
    }
}
