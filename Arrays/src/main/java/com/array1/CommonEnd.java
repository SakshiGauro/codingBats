package com.array1;

import java.util.Scanner;

public class CommonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in first array ");
        int[] arr1 = new int[in.nextInt()];
        for(int i = 0; i<arr1.length; i++)
        {
            System.out.println("Enter an element");
            arr1[i] = in.nextInt();
        }
        
        System.out.println("number of elements in second array ");
        int[] arr2 = new int[in.nextInt()];
        for(int i = 0; i<arr2.length; i++)
        {
            System.out.println("Enter an element");
            arr2[i] = in.nextInt();
        }
        CommonEnd obj = new CommonEnd();
        System.out.println(obj.commonEnd(arr1,arr2));
    }
}
