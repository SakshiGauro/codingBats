package com.stringTimes;
import java.util.Scanner;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String result = "";
        for(int i = 0; i < n; i++){
            result += str;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();
        System.out.println("Enter an int");
        int n = in.nextInt();

        StringTimes obj = new StringTimes();
        System.out.println(obj.stringTimes(str,n));
    }
}
