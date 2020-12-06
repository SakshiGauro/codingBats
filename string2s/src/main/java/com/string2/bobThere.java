package com.string2;

import java.util.Scanner;

public class bobThere {
    public boolean bobThere(String str) {
        String check="";
        for (int i=0; i<=str.length()-3; i++)
        {
            check=str.substring(i,i+3);
            if ((check.charAt(0)=='b') && (check.charAt(2)=='b'))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        bobThere obj= new bobThere();
        System.out.println(obj.bobThere(word));
    }
}
