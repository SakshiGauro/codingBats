package com.String1s.right2;
import com.string2.StarOut;

import java.util.Scanner;

public class Right2 {
    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2) ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        Right2 obj = new Right2();
        System.out.println(obj.right2(str));
    }
}
