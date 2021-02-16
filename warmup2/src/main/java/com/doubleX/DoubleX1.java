package com.doubleX;

import java.util.Scanner;

public class DoubleX1 {
    //long method using substring
    public boolean doubleX(String str) {
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 1).equals("x")){
                if(str.substring(i+1,i+2).equals("x"))
                    return true;
                else
                    return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        DoubleX1 obj = new DoubleX1();
        System.out.println(obj.doubleX(str));
    }

}
