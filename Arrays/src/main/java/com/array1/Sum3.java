package com.array1;
import java.util.Scanner;

public class Sum3 {
    public int sum3(int[] nums) {
        int sum = 0;
        for (int var : nums){
            sum += var;
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

        Sum3 obj = new Sum3();
        System.out.println(obj.sum3(arr));
    }
}
