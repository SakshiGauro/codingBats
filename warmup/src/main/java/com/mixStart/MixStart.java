package com.mixStart;

import java.util.Scanner;

public class MixStart {
    public boolean mixStart(String str) {
        return str.length() > 2 && str.substring(1, 3). equals("ix");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        MixStart obj = new MixStart();
        System.out.println(obj.mixStart(str));
    }
}
