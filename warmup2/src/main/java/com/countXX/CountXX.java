package com.countXX;
import java.util.Scanner;

public class CountXX {
    public int countXX(String str) {
        int c = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i+2).equals("xx"))
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        CountXX obj = new CountXX();
        System.out.println(obj.countXX(str));
    }
}
