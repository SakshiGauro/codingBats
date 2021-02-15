package com.front3;

import java.util.Scanner;

public class Front3 {
    public String front3(String str) {
        if(str.length() < 3)
            return str + str + str;
        return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        Front3 obj = new Front3();
        System.out.println(obj.front3(str));
    }
}
