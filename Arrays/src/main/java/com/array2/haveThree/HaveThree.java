package com.array2.haveThree;

import java.util.Scanner;

public class HaveThree {
    public boolean haveThree(int[] nums) {
        if (nums.length < 5)
            return false;
        int start = 0;
        if (nums[1] == 3)
            start = 1;
        int c = 0;
        for (int i = start; i < nums.length; i += 2)
        {
            if (nums[i] == 3)
                c++;
        }
        return c == 3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        HaveThree obj = new HaveThree();
        System.out.println(obj.haveThree(arr));
    }
}
