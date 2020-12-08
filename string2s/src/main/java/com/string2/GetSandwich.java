package com.string2;
import java.util.Scanner;

public class GetSandwich {
    public String getSandwich(String str) {
        int first=str.indexOf("bread");
        int last=str.lastIndexOf("bread");
        if((first==-1 || last==-1) || (first==last))
            return "";
        else
            return str.substring(first+5,last);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        GetSandwich obj= new GetSandwich();
        System.out.println(obj.getSandwich(word));
    }
}
