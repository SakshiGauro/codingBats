package com.max1020;

import java.util.Scanner;

public class Max1020 {
    public int max1020(int a, int b) {
        if(b > a){
            int temp = a;
            a = b;
            b = temp;
        }
        if(a >= 10 && a <= 20)
            return a;
        else if(b >= 10 && b <= 20)
            return b;
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter a number");
        int b = in.nextInt();

        Max1020 obj = new Max1020();
        System.out.println(obj.max1020(a,b));
    }
}
