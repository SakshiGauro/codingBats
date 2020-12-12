package com.String1s;

import java.util.Scanner;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String tag1=out.substring(0,2);
        String tag2=out.substring(2);
        return tag1+word +tag2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        MakeOutWord obj = new MakeOutWord();
        System.out.println(obj.makeOutWord(word1, word2));
    }
}
