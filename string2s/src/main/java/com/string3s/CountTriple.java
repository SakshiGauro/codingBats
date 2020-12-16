package com.string3s;
import java.util.Scanner;

public class CountTriple {
    public int countTriple(String str) {
        if (str.length() <3)
            return 0;
        int c =0;
        int i=0;
        String check = "";
        while(i<str.length()-2)
        {
            check= str.substring(i,i+1);
            if (str.substring(i+1,i+2).equals(check) &&
                    str.substring(i+2,i+3).equals(check))
            {
                c++;
            }
            i++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        CountTriple obj = new CountTriple();
        System.out.println(obj.countTriple(word));
    }
}
