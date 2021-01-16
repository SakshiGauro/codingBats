package com.array2.fizzArray3;

import java.util.Scanner;


public class FizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int[] arr = new int[end-start];
        if (end - start == 0)
            return arr;
        arr[0] = start;
        for (int i = 1; i< arr.length; i++)
        {
            arr[i] = arr[i-1] +1;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Start number");
        int start = in.nextInt();
        System.out.println("End number");
        int end = in.nextInt();
        FizzArray3 obj = new FizzArray3();
        int[] arr = obj.fizzArray3(start, end);
        for(int val : arr)
        {
            System.out.print(val + " ");
        }
    }
}
