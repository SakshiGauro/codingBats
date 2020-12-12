package com.String1s;
import java.util.Scanner;

public class FirstHalf {
    public String firstHalf(String str) {
        String half=str.substring(0,(int)str.length()/2);
        return half;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        FirstHalf obj = new FirstHalf();
        System.out.println(obj.firstHalf(word));
    }
}
