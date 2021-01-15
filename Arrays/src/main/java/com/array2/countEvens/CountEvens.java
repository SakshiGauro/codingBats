package com.array2.countEvens;

import java.util.Scanner;

public class CountEvens {
    public int countEvens(int[] nums) {
        if(nums.length ==  0)
            return 0;
        else
        {
            int c = 0;
            for (int var : nums)
            {
                if (var % 2 == 0)
                    c++;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        CountEvens obj = new CountEvens();
        System.out.println(obj.countEvens(arr));
    }
}
