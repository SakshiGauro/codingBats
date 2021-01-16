package com.array2.has77;

import java.util.Scanner;

public class Has77 {
    public boolean has77(int[] nums) {
        int i = 0;
        while (i < nums.length -2)
        {
            if (nums[i] == 7 && (nums[i+1] == 7 || nums[i+2] == 7))
                return true;
            i++;
        }
        if (nums.length > 1 && nums[nums.length-2] == 7 && nums[nums.length-1] == 7)
            return true;
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

        Has77 obj = new Has77();
        System.out.println(obj.has77(arr));
    }
}
