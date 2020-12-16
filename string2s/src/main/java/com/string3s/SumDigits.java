package com.string3s;
import java.util.Scanner;

public class SumDigits {
    public int sumDigits(String str) {
        int sum=0;
        for (int i=0; i<str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                sum += Integer.parseInt(str.substring(i,i+1));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        SumDigits obj = new SumDigits();
        System.out.println(obj.sumDigits(word));
    }
}
