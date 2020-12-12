package com.String1s;
import java.util.Scanner;

public class ComboString {
    public String comboString(String a, String b) {
        if (a.length()<b.length())
            return a+b+a;
        else
            return b+a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        ComboString obj = new ComboString();
        System.out.println(obj.comboString(word1, word2));
    }
}
