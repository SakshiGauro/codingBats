package com.array2.only14;

import java.util.Scanner;

public class Only14 {
    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] !=1 && nums[i] !=4)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        Only14 obj = new Only14();
        System.out.println(obj.only14(arr));
    }
}
