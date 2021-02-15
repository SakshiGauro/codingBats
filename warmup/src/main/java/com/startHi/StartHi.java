package com.startHi;

import java.util.Scanner;

public class StartHi {
    public boolean startHi(String str) {
        return str.length() > 1 && str.substring(0,2).equals("hi");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        StartHi obj = new StartHi();
        System.out.println(obj.startHi(str));
    }
}
