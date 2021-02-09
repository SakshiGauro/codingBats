package com.sleepIn;
import java.util.Scanner;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Weekday?");
        boolean week = in.nextBoolean();
        System.out.println("Vacation?");
        boolean vac = in.nextBoolean();

        SleepIn obj = new SleepIn();
        System.out.println(obj.sleepIn(week, vac));
    }
}
