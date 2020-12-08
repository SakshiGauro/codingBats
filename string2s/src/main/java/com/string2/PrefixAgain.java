package com.string2;

import java.util.Scanner;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String comp=str.substring(0,n);
        for (int i=n; i<=str.length()-n; i++)
        {
            String check= str.substring(i,i+n);
            if (check.equals(comp))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        System.out.println("Enter a number");
        int num = input.nextInt();

        PrefixAgain obj = new PrefixAgain();
        System.out.println(obj.prefixAgain(word,num));
    }
}
