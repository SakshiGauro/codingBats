package com.stringYak;
import java.util.Scanner;

public class StringYak {
    public String stringYak(String str) {
        if(str.length() < 3)
            return str;
        str = str + "vo";
        String result = "";
        int i = 0;
        while (i < str.length() - 2){
            if(str.substring(i, i +1).equals("y") && str.substring(i + 2, i + 3).equals("k"))
                i += 3;
            else{
                result += str.substring(i,i+1);
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        StringYak obj = new StringYak();
        System.out.println(obj.stringYak(str));
    }


}
