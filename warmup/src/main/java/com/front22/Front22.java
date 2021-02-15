package com.front22;

import java.util.Scanner;

public class Front22 {
    public String front22(String str) {
        if(str.length() < 2)
            return str + str + str;
        return str.substring(0, 2) + str + str.substring(0,2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        Front22 obj = new Front22();
        System.out.println(obj.front22(str));
    }
}
