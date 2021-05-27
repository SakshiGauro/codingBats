package com.String1s.ExtraEnd;
import java.util.Scanner;

public class ExtraEnd {
    public String extraEnd(String str) {
        String rep= str.substring(str.length()-2);
        return rep+rep+rep;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        ExtraEnd obj = new ExtraEnd();
        System.out.println(obj.extraEnd(word));
    }
}
