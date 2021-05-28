package com.String1s.HelloName;
import java.util.Scanner;

public class HelloName {
    public String helloName(String name) {
        String greet= "Hello "+ name+"!";
        return greet;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        HelloName obj = new HelloName();
        System.out.println(obj.helloName(word));
    }
}
