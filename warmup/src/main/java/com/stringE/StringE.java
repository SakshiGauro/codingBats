package com.stringE;

import java.util.Scanner;

public class StringE {
    public boolean stringE(String str) {
        int c = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.substring(i,i+1).equals("e"))
                c++;
        }
        return c >= 1 && c <= 3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        StringE obj = new StringE();
        System.out.println(obj.stringE(str));
    }
}
