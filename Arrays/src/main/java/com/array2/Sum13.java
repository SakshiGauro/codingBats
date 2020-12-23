package com.array2;
import java.util.Scanner;

public class Sum13 {
    public int sum13(int[] nums) {
        if (nums.length == 0)
            return 0;
        int sum = 0;
        int i = 1;
        if (nums[0] != 13)
            sum += nums[0];
        while (i<nums.length)
        {
            if (nums[i] != 13 && nums[i-1] != 13)
                sum += nums[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        Sum13 obj = new Sum13();
        System.out.println(obj.sum13(arr));
    }
}
