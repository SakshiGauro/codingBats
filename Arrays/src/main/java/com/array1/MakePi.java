package com.array1;

import java.util.Scanner;

public class MakePi {
    public int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MakePi obj = new MakePi();
        int[] arr = obj.makePi();
        System.out.print("{ ");
        for(int var : arr){
            System.out.print(var+ ", ");
        }
        System.out.println("}");

    }
}
