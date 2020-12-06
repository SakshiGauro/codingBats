package com.string2;
import java.util.Scanner;

public class EndOther {
    public boolean endOther(String a, String b) {
        String str1=a.toLowerCase();
        String str2=b.toLowerCase();
        int sta=a.length();
        int stb=b.length();
        int ab=Math.abs(sta-stb);
        if (sta==stb && str1.equals(str2))
            return true;
        else if (sta>stb)
        {
            if (str1.substring(sta-stb).equals(str2))
                return true;
        }
        else
        {
            if (str2.substring(stb-sta).equals(str1))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1 = in.nextLine();
        String word2 = in.nextLine();

        EndOther obj = new EndOther();
        System.out.println(obj.endOther(word1,word2));
    }
}
