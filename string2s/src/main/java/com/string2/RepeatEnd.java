package com.string2;
import java.util.Scanner;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String repeatEnd="";
        for (int i=1; i<=n; i++)
        {
            repeatEnd += str.substring(str.length()-n);
        }
        return repeatEnd;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        System.out.println("Enter a number");
        int num = input.nextInt();

        RepeatEnd obj = new RepeatEnd();
        System.out.println(obj.repeatEnd(word,num));
    }
}
