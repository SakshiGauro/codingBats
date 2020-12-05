package com.string2;
import java.util.Scanner;

public class CatDog {
    public boolean catDog(String str) {
        int c=0;
        int d=0;
        for (int i=0; i< str.length()-2; i++)
        {
            String check= str.substring(i,i+3);
            if (check.equals("cat"))
                c++;
            else if (check.equals("dog"))
                d++;
        }
        if (c==d)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();

        CatDog obj = new CatDog();
        System.out.println(obj.catDog(word));
    }
}
