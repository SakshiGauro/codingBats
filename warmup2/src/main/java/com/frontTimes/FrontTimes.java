package com.frontTimes;

import java.util.Scanner;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String result = "";
        for(int i = 0; i < n; i++){
            if(str.length() < 3)
                result += str;
            else
                result += str.substring(0,3);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();
        System.out.println("Enter an int");
        int n = in.nextInt();

        FrontTimes obj = new FrontTimes();
        System.out.println(obj.frontTimes(str,n));
    }
}
