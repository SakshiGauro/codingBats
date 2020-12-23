package com.array2;
import java.util.Scanner;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int mx = -1;
        int mn = -1;
        int sum = 0;
        for (int var : nums)
        {
            if (var < min)
                min = var;
            if (var > max)
                max = var;
        }
        for (int var : nums)
        {
            if (var == min)
                mn++;
            if (var == max)
                mx++;
        }
        if (max == min)
            return max / (nums.length - 2);
        for (int var : nums)
        {
            if (var != max && var != min)
                sum += var;
        }
        sum += mn * min + mx * max;
        return sum/ (nums.length - 2);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        CenteredAverage obj = new CenteredAverage();
        System.out.println(obj.centeredAverage(arr));
    }
}
