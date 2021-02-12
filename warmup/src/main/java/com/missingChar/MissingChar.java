package com.missingChar;

import java.util.Scanner;

public class MissingChar {
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n+1, str.length());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter index");
        int ind = in.nextInt();
        in.nextLine();
        System.out.println("Enter a string");
        String str = in.nextLine();
        
        MissingChar obj = new MissingChar();
        System.out.println(obj.missingChar(str,ind));
    }
}
