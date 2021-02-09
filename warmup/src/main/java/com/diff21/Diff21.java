package com.diff21;
import java.util.Scanner;

public class Diff21 {
    public int diff21(int n) {
        if (n <= 21)
            return 21 - n;
        return 2 * (n - 21);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        Diff21 obj = new Diff21();
        System.out.println(obj.diff21(num));
    }
}
