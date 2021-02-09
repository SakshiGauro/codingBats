package com.sumDouble;
import java.util.Scanner;

public class SumDouble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter a number");
        int b = in.nextInt();

        SumDouble obj = new SumDouble();
        System.out.println(obj.sumDouble(a,b));
    }

    public int sumDouble(int a, int b) {
        if(a == b)
            return 2 * (a + b);
        return a +b;
    }
}
