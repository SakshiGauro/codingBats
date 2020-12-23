package com.array2;
import java.util.Scanner;

public class BigDiff {
    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int var : nums)
        {
            if (var < min)
                min = var;
            if (var > max)
                max = var;
        }
        return max - min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        BigDiff obj = new BigDiff();
        System.out.println(obj.bigDiff(arr));
    }
}
