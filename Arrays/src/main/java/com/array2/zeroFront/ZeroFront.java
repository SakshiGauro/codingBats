package com.array2.zeroFront;

import java.util.Scanner;

public class ZeroFront {
    public int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        int j = 0;
        //int c = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
                arr[j] = 0;
                j++;
            }
    /*else
      c++;*/
        }
        for (int i = 0; i< nums.length; i++)
        {
            if (nums[i] != 0)
            {
                arr[j] = nums[i];
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        ZeroFront obj = new ZeroFront();
        int[] arr1 = obj.zeroFront(arr);
        for(int val : arr1)
        {
            System.out.print(val + " ");
        }
    }
}
