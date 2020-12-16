package com.string3s;
import java.util.Scanner;

public class gHappy {
    public boolean gHappy(String str) {
        if (str.indexOf("g") == -1)
            return true;
        boolean result = false;
        String comp="";
        int i=0;
        while (i<str.length()-1)
        {
            comp = str.substring(i,i+1);
            if (comp.equals("g"))
            {
                if (str.substring(i+1,i+2).equals("g"))
                {
                    result = true;
                    i += 1 ;
                }
                else
                    return false;
                i++;
            }
            i++;
        }
        int g=str.lastIndexOf("g");
        if (str.length() >3 && g == str.length()-1 && !(str.charAt(g-1)=='g'))
            result = false;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        gHappy obj = new gHappy();
        System.out.println(obj.gHappy(word));
    }
}
