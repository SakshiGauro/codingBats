package com.array2.lucky13;

import java.util.Scanner;

public class Lucky13 {
    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 1 || nums[i] == 3)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        Lucky13 obj = new Lucky13();
        System.out.println(obj.lucky13(arr));
    }
}
