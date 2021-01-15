package com.array2.no14;

import java.util.Scanner;

public class No14 {
    public boolean no14(int[] nums) {
        int one = 0, four = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 1)
                one++;
            if (nums[i] == 4)
                four++;
        }
        return one == 0 || four == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        No14 obj = new No14();
        System.out.println(obj.no14(arr));
    }
}
