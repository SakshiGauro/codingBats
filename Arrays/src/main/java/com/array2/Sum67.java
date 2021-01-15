package com.array2;

import java.util.Arrays;
import java.util.Scanner;

public class Sum67 {
    public int sum67(int[] nums) {
        if (nums.length == 0)
            return 0;
        boolean gate = true;
        int sums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6)
                gate = false;
            if (gate)
                sums += nums[i];
            if (nums[i] == 7 && gate == false)
                gate = true;
        }
        return sums;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in an array ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

//        Arrays.stream(arr).forEach(el -> {
//            System.out.println("Enter an element");
//            arr[el] = in.nextInt();
//        });

        System.out.println(Arrays.stream(arr).parallel().sum());
        System.out.println(Arrays.stream(arr).min());

        Arrays.stream(arr).filter(el->el>=5).forEach(System.out::println);

        Sum67 obj = new Sum67();
        System.out.println(obj.sum67(arr));
    }
}
