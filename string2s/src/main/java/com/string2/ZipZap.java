package com.string2;
import java.util.Scanner;

public class ZipZap {
    public String zipZap(String str) {
        String zipZap="";
        String check="";
        int i=0;
        while (i<str.length())
        {
            if ( i<str.length()-2 &&
                    str.substring(i,i+1).equals("z") &&
                    str.substring(i+2,i+3).equals("p"))
            {
                zipZap += "zp";
                i +=3;
            }
            else
            {
                zipZap +=str.substring(i,i+1);
                i ++;
            }
        }
        return zipZap;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();

        ZipZap obj = new ZipZap();
        System.out.println(obj.zipZap(word));
    }
}
