package com.monkeyTrouble;

import java.util.Scanner;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Monkey one smiling?");
        boolean one = in.nextBoolean();
        System.out.println("Monkey two smiling?");
        boolean two = in.nextBoolean();

        MonkeyTrouble obj = new MonkeyTrouble();
        System.out.println(obj.monkeyTrouble(one, two));
    }
}
