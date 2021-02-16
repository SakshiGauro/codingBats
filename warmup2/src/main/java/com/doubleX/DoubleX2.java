package com.doubleX;
import java.util.Scanner;

public class DoubleX2 {
    //shorter method using indexOf
    public boolean doubleX(String str) {
        int in = str.indexOf("x");
        return in != -1 && str.indexOf("x",in + 1) == in + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();

        DoubleX2 obj = new DoubleX2();
        System.out.println(obj.doubleX(str));
    }
}
