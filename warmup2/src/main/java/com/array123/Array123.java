package com.array123;

import java.util.Scanner;

public class Array123 {
    public boolean array123(int[] nums) {
        if(nums.length < 3)
            return false;
        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int[] arr = new int[in.nextInt()];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        Array123 obj = new Array123();
        System.out.println(obj.array123(arr));
    }
}
