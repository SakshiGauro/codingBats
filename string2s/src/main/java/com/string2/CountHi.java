package com.string2;
import java.util.Scanner;

public class CountHi {
    public int countHi(String str) {
        int c=0;
        for (int i=0; i<str.length()-1; i++){
            String check= str.substring(i,i+2);
            if (check.equals("hi")){
                c +=1;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter word");
        String word = input.nextLine();

        CountHi obj = new CountHi();
        System.out.println(obj.countHi(word));
    }
}
