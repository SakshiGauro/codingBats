package com.string2;
import java.util.Scanner;

public class CountCode {
    public int countCode(String str) {
        int c=0;
        for (int i=0; i<str.length()-3; i++)
        {
            String newStr= str.substring(i, i+4);
            if (((newStr.substring(0,2)).equals("co")) && (newStr.charAt(3)=='e'))
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        CountCode obj= new CountCode();
        System.out.println(obj.countCode(word));
    }
}
