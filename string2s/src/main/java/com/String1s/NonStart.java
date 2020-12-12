package com.String1s;
import java.util.Scanner;

public class NonStart {
    public String nonStart(String a, String b) {
        String noA= a.substring(1,a.length());
        String noB=b.substring(1,b.length());
        return noA+noB;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        NonStart obj = new NonStart();
        System.out.println(obj.nonStart(word1, word2));
    }
}
