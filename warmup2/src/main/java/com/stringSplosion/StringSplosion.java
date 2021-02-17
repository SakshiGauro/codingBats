package com.stringSplosion;

import java.util.Scanner;

public class StringSplosion {
    public String stringSplosion(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            result += str.substring(0,i);
        }
        return result + str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        StringSplosion obj = new StringSplosion();
        System.out.println(obj.stringSplosion(str));
    }
}
