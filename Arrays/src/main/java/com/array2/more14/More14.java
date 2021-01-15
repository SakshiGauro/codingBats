package com.array2.more14;

import java.util.Scanner;

public class More14 {
    public boolean more14(int[] nums) {
        int one = 0, four = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 1)
                one++;
            if (nums[i] == 4)
                four++;
        }
        return one > four;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        More14 obj = new More14();
        System.out.println(obj.more14(arr));
    }
}
