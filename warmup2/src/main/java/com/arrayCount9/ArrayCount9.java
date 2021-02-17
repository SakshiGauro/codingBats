package com.arrayCount9;
import java.util.Scanner;

public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int c = 0;
        for(int var : nums){
            if(var == 9)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int[] arr = new int[in.nextInt()];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter an element");
            arr[i] = in.nextInt();
        }

        ArrayCount9 obj = new ArrayCount9();
        System.out.println(obj.arrayCount9(arr));
    }
}
