package com.array1;
import java.util.Scanner;

public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        SameFirstLast obj = new SameFirstLast();
        System.out.println(obj.sameFirstLast(arr));
    }
}
