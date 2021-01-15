package com.array2.sum28;

import java.util.Scanner;

public class Sum28 {
    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 2)
                sum += 2;
        }
        return sum == 8;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        Sum28 obj = new Sum28();
        System.out.println(obj.sum28(arr));
    }
}
