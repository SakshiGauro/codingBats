package com.backAround;

import java.util.Scanner;

public class BackAround {
    public String backAround(String str) {
        return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        BackAround obj = new BackAround();
        System.out.println(obj.backAround(str));
    }
}
