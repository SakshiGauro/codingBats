package com.string2;
import java.util.Scanner;

public class StarOut {
    public String starOut(String str) {
        if (str.indexOf("*") == -1)
            return str;
        if (str.length()<=2)
            return "";
        int i=1;
        String result="";
        if (str.indexOf("*")>1)
            result= str.substring(0,1);
        while (i<str.length()-1)
        {
            if (!(str.charAt(i) == '*' ||
                    str.charAt(i - 1) == '*' ||
                    str.charAt(i + 1) == '*'))
            {
                result += str.substring(i,i+1);
            }
            i++;
        }
        if (str.lastIndexOf("*")<str.length()-2)
            result += str.substring(str.length()-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();

        StarOut obj = new StarOut();
        System.out.println(obj.starOut(word));
    }
}
