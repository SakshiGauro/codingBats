package com.in3050;
import java.util.Scanner;

public class In3050 {
    public boolean in3050(int a, int b) {
        return (a >= 30 && b >= 30 && a <= 40 && b <= 40) || (a >= 40 && b >= 40 && a <= 50 && b <= 50);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter a number");
        int b = in.nextInt();

        In3050 obj = new In3050();
        System.out.println(obj.in3050(a,b));
    }
}
