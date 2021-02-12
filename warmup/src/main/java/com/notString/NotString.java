package com.notString;
import java.util.Scanner;

public class NotString {
    public String notString(String str) {
        if((str.length() >= 3) && (str.substring(0,3).equals("not")))
            return str;
        return "not " + str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        NotString obj = new NotString();
        System.out.println(obj.notString(str));
    }
}
