package com.array2.fizzArray;

import java.util.Scanner;

public class FizzArray {
    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=i;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int num = in.nextInt();
        FizzArray obj = new FizzArray();
        int[] arr = obj.fizzArray(num);
        for(int val : arr)
        {
            System.out.print(val + " ");
        }
    }

}
