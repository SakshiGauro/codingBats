package com.frontBack;

import java.util.Scanner;

public class FrontBack {
    public String frontBack(String str) {
        if(str.length() < 2)
            return str;
        return str.substring(str.length() - 1) + str.substring(1, str.length() -1) + str.substring(0,1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        FrontBack obj = new FrontBack();
        System.out.println(obj.frontBack(str));
    }
}
