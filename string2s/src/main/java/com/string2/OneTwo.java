package com.string2;
import java.util.Scanner;

public class OneTwo {
    public String oneTwo(String str) {
        String oneTwo="";
        int i=0;
        while (oneTwo.length()/3 != str.length()/3)
        {
            oneTwo += str.substring(i+1,i+3)+ str.substring(i,i+1);
            i +=3;
        }
        return oneTwo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();

        OneTwo obj = new OneTwo();
        System.out.println(obj.oneTwo(word));
    }
}
