package com.delDel;

import java.util.Scanner;

public class DelDel {
    public String delDel(String str) {
        if(str.length() > 3 && str.substring(1, 4).equals("del"))
            return str.substring(0,1) + str.substring(4);
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        DelDel obj = new DelDel();
        System.out.println(obj.delDel(str));
    }
}
