package com.string3s;
import java.util.Scanner;

public class CountYZ {
    public int countYZ(String str) {
        int c=0;
        str = str.toLowerCase();
        int i=0;
        while (i<str.length())
        {
            if (!Character.isLetter(str.charAt(i)) && i !=0)
            {
                if (str.substring(i-1,i).equals("y") || str.substring(i-1,i).equals("z"))
                    c++;
            }
            i++;
        }
        if (str.substring(i-1).equals("y") || str.substring(i-1).equals("z"))
            c++;
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        CountYZ obj = new CountYZ();
        System.out.println(obj.countYZ(word));
    }
    
}
