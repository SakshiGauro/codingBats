package com.last2;

import java.util.Scanner;

public class Last2 {
    public int last2(String str) {
        if(str.length() < 3)
            return 0;
        String end = str.substring(str.length() - 2);
        int c = 0;
        for(int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i + 2).equals(end))
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        Last2 obj = new Last2();
        System.out.println(obj.last2(str));
    }
}
