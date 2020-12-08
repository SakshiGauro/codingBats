package com.string2;
import java.util.Scanner;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String repeatFront="";
        for (int i=0; i<n; i++)
        {
            repeatFront += str.substring(0,n-i);
        }
        return repeatFront;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        System.out.println("Enter a number");
        int num = input.nextInt();

        RepeatFront obj = new RepeatFront();
        System.out.println(obj.repeatFront(word,num));
    }
}
