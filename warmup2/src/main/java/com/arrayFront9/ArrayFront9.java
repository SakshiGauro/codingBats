package com.arrayFront9;

import java.util.Scanner;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if(nums.length > 4)
            end = 4;
        for(int i = 0; i < end; i++){
            if(nums[i] == 9)
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

        ArrayFront9 obj = new ArrayFront9();
        System.out.println(obj.arrayFront9(arr));
    }
}
