package com.everyNth;

import java.util.Scanner;

public class EveryNth {
    public String everyNth(String str, int n) {
        String result ="";
        for(int i = 0; i < str.length(); i++){
            if(i % n == 0)
                result += str.substring(i,i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter index");
        int ind = in.nextInt();
        in.nextLine();
        System.out.println("Enter a string");
        String str = in.nextLine();

        EveryNth obj = new EveryNth();
        System.out.println(obj.everyNth(str,ind));
    }
}
