package com.array2.has22;

import java.util.Scanner;

public class Has22 {
    public boolean has22(int[] nums) {
        int i = 0;
        while (nums.length > 1 && i < nums.length -1)
        {
            if (nums[i] == 2 && nums[i+1] == 2)
                return true;
            i++;
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

        Has22 obj = new Has22();
        System.out.println(obj.has22(arr));
    }
}
