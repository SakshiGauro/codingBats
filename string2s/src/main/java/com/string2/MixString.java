package com.string2;
import java.util.Scanner;

public class MixString {
    public String mixString(String a, String b) {
        String all="";
        int i=0;
        while (all.length()!=a.length()+b.length())
        {
            if (i<a.length())
            {
                all +=a.substring(i,i+1);
            }
            if (i<b.length())
            {
                all +=b.substring(i,i+1);
            }
            i++;
        }
        return all;
    }
        /*make a new string 
        string traversing to get a string at a time from a 
        string traversing to get a string at a time from b
        add them to all
        return all*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1 = in.nextLine();
        String word2 = in.nextLine();

        MixString obj = new MixString();
        System.out.println(obj.mixString(word1,word2));
    }

}
