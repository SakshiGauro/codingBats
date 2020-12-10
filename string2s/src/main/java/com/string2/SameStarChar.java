package com.string2;

import java.util.Scanner;

public class SameStarChar {
    public boolean sameStarChar(String str) {
        int numAsh=0;
        int numEqual=0;
        int a;
        int i=1;
        while ((str.indexOf("*",i) !=-1) && (str.indexOf("*",i) !=str.length()-1))
        {
            numAsh++;
            a=str.indexOf("*",i);
            if (str.charAt(a-1)==str.charAt(a+1))
            {
                numEqual++;
            }
            i= str.indexOf("*",i)+2;
        }
        if (numAsh==0 || numAsh==numEqual)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();

        SameStarChar obj = new SameStarChar();
        System.out.println(obj.sameStarChar(word));
    }
}
