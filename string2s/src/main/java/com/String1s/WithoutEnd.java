package com.String1s;
import java.util.Scanner;

public class WithoutEnd {
    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        WithoutEnd obj = new WithoutEnd();
        System.out.println(obj.withoutEnd(word));
    }

}
