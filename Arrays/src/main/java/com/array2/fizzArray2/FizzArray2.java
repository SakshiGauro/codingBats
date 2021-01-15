package com.array2.fizzArray2;

import java.util.Scanner;

public class FizzArray2 {
    public String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i<arr.length; i++)
        {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int num = in.nextInt();
        FizzArray2 obj = new FizzArray2();
        String[] arr = obj.fizzArray2(num);
        for(String val : arr)
        {
            System.out.print("\" " + val + "\""+ " ");
        }
    }
}
