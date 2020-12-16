package com.string3s;
import java.util.Scanner;

public class WithoutString {
    public String withoutString(String base, String remove) {
        String word = "";
        int rem = remove.length();
        int i=0;
        while (i <= base.length()-rem)
        {
            if (base.substring(i,i+rem).equalsIgnoreCase(remove))
            {
                i +=rem;
            }
            else
            {
                word += base.substring(i,i+1);
                i++;
            }
        }
        return word + base.substring(i);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1 = in.nextLine();
        String word2 = in.nextLine();

        WithoutString obj = new WithoutString();
        System.out.println(obj.withoutString(word1,word2));
    }
}
