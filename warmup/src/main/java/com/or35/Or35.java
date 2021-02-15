package com.or35;

import java.util.Scanner;

public class Or35 {
    public boolean or35(int n) {
        return n % 5 == 0 || n % 3 == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        Or35 obj = new Or35();
        System.out.println(obj.or35(num));
    }
}
