package com.array2.shiftLeft;

import java.util.Scanner;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0)
            return nums;
        int term = nums[0];
        for (int i =0; i< nums.length -1; i++)
        {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = term;
        return nums;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        ShiftLeft obj = new ShiftLeft();
        int[] arr1 = obj.shiftLeft(arr);
        for(int val : arr1)
        {
            System.out.print(val + " ");
        }
    }
}
