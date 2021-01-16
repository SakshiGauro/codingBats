package com.array2.modThree;

import java.util.Scanner;

public class ModThree {
    public boolean modThree(int[] nums) {
        int EOO = 0;
        for (int i = 0; i< nums.length - 2; i++)
        {
            if (nums[i] % 2 == 1)
                EOO = 1;
            else
                EOO = 0;
            if (nums[i] % 2 == EOO && nums[i+1] % 2 == EOO && nums[i+2] % 2 == EOO)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        ModThree obj = new ModThree();
        System.out.println(obj.modThree(arr));
    }
}
