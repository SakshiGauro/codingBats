package com.stringMatch;
import java.util.Scanner;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int end = a.length();
        if (b.length() < a.length())
            end = b.length();
        int c = 0;
        for (int i = 0; i < end - 1; i++){
            if(a.substring(i, i+2).equals(b.substring(i, i + 2)))
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = in.nextLine();
        System.out.println("Enter a string");
        String b = in.nextLine();

        StringMatch obj = new StringMatch();
        System.out.println(obj.stringMatch(a,b));
    }
}
