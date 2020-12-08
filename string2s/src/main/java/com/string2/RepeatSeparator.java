package com.string2;
import java.util.Scanner;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        if (count==0)
            return "";
        String repeatSeparator=word;
        for (int i=1; i<count; i++)
        {
            repeatSeparator += sep+word;
        }
        return repeatSeparator;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        System.out.println("Enter a separator");
        String sep = input.nextLine();
        System.out.println("Enter a number");
        int num = input.nextInt();

        RepeatSeparator obj = new RepeatSeparator();
        System.out.println(obj.repeatSeparator(word, sep, num));
    }

}
