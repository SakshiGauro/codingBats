package com.endUp;

import java.util.Scanner;

public class EndUp {
    public String endUp(String str) {
        if(str.length() > 3)
            return str.substring(0, str.length() - 3) + str.substring(str.length()-3).toUpperCase();
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        EndUp obj = new EndUp();
        System.out.println(obj.endUp(str));
    }
}
