package com.array1;
import java.util.Scanner;

public class FirstLast6 {
    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length-1] == 6);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        FirstLast6 obj = new FirstLast6();
        System.out.println(obj.firstLast6(arr));
    }
}
