package com.stringX;

import java.util.Scanner;

public class StringX {
    public String stringX(String str) {
        String result = "";
        if(str.length() >= 1 && str.substring(0,1).equals("x")) //substring can be replace by charAt
            result ="x";
        for(int i = 0; i < str.length() ; i++){
            if(!str.substring(i, i + 1).equals("x")) //substring can be replace by charAt
                result += str.substring(i, i + 1);
        }
        if(str.length() > 1 && str.substring(str.length() - 1).equals("x"))
            result += "x";
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        StringX obj = new StringX();
        System.out.println(obj.stringX(str));
    }
}
