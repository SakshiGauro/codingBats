package com.startOz;

import java.util.Scanner;

public class StartOz {
    public String startOz(String str) {
        if(str == "")
            return str;
        String result = "";
        if(str.substring(0,1).equals("o"))
            result += "o";
        if(str.length() >= 2 && str.substring(1,2).equals("z"))
            result += "z";
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        StartOz obj = new StartOz();
        System.out.println(obj.startOz(str));
    }
}
