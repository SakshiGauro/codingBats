package com.stringBits;

import java.util.Scanner;

public class StringBits {
    public String stringBits(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i += 2){
            result += str.substring(i, i +1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        StringBits obj = new StringBits();
        System.out.println(obj.stringBits(str));
    }
}
