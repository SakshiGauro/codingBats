package com.string2;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DoubleChar {
    public String doubleChar(String str) {
        String ans="";
        for (int i=0; i<str.length(); i++)
        {
            String charac= str.substring(i, i+1);
            ans += charac + charac;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        DoubleChar obj=new DoubleChar();
        System.out.println("Enter a word");
        String word= input.nextLine();
        System.out.println(obj.doubleChar(word) );
    }

}
