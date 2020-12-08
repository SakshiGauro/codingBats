package com.string2;
import java.util.Scanner;

public class xyzMiddle {
    public boolean xyzMiddle(String str) {
/*        check the 'middle' of the string and see if it's 'xyz'
        3- "ABC"-- is xyz at index 0 
        5- "ABCDE" -- is xyz at index 1
        7- "ABCDEFG" -- is xyz at index 2
        6- "ABCDEF" -- is xyz at index 1 or 2
        4- "ABCD" -- is 'xyz' at index 0,1

        if str length is ODD
        return if xyz is at index length/2 -1
        else return false
        else (even)
        return if xyz is at index length/2-2 or length/2 -1*/
        int midPoint= str.length()/2;
        if (str.indexOf("xyz") == -1)
            return false;
        if (str.length() % 2 ==1)
            return str.substring(midPoint-1, midPoint+2).equals("xyz");
        else
            return str.substring(midPoint-1, midPoint+2).equals("xyz") || str.substring(midPoint-2, midPoint+1).equals("xyz");
        // return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        xyzMiddle obj= new xyzMiddle();
        System.out.println(obj.xyzMiddle(word));
    }

}
