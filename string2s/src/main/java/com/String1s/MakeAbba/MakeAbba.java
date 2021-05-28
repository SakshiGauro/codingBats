package com.String1s.MakeAbba;
import java.util.Scanner;

public class MakeAbba {
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        MakeAbba obj = new MakeAbba();
        System.out.println(obj.makeAbba(word1, word2));
    }
}
