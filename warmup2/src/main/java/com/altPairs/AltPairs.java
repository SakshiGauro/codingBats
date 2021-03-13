package com.altPairs;

import java.util.Scanner;

public class AltPairs {
    public String altPairs(String str) {
        String result = "";
        int a = 0, b = 1;
        for(int i = 0; i < str.length(); i++){
            if(a == i){
                result += str.substring(i, i + 1);
                a += 4;
            }
            if(b == i){
                result += str.substring(i, i + 1);
                b += 4;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        AltPairs obj = new AltPairs();
        System.out.println(obj.altPairs(str));
    }
}
