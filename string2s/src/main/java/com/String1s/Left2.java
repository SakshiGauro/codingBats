package com.String1s;

import java.util.Scanner;

public class Left2 {
    public String left2(String str) {
        String start= str.substring(0,2);
        String end= str.substring(2);
        return end+start;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        Left2 obj = new Left2();
        System.out.println(obj.left2(word));
    }
}
