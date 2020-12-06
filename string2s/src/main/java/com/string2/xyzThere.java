package com.string2;
import java.util.Scanner;

public class xyzThere {
    public boolean xyzThere(String str) {
        boolean result=true;
        if (str.indexOf("xyz")==-1)
            return false;
        for (int i=0; i<str.length(); i++)
        {
            if (i<str.length()-3)
            {
                if (str.substring(i+1,i+4).equals("xyz"))
                    if (str.substring(i,i+1).equals("."))
                        result= false;
                    else
                        result=true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        xyzThere obj= new xyzThere();
        System.out.println(obj.xyzThere(word));
    }
}
