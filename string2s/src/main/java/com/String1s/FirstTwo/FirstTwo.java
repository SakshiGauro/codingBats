package com.String1s.FirstTwo;
import java.util.Scanner;

public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length()>= 2)
            return str.substring(0,2);
        else
        {
            return str;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        FirstTwo obj = new FirstTwo();
        System.out.println(obj.firstTwo(word));
    }
}
