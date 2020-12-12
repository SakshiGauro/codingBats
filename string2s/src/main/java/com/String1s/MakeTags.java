package com.String1s;

import java.util.Scanner;

public class MakeTags {
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        MakeTags obj = new MakeTags();
        System.out.println(obj.makeTags(word1, word2));
    }
}
