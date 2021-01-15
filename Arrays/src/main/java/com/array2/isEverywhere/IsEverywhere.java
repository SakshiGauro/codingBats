package com.array2.isEverywhere;

import java.util.Scanner;

public class IsEverywhere {
    public boolean isEverywhere(int[] nums, int val) {
        if (nums.length < 2)
            return true;
        int start = 0;
        if (nums[1] == val)
            start = 1;
        for (int i = start; i < nums.length; i += 2)
        {
            if (nums[i] != val)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value:");
        int num = in.nextInt();

        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        IsEverywhere obj = new IsEverywhere();
        System.out.println(obj.isEverywhere(arr, num));
    }
}
