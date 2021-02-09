package com.parrotTrouble;
import java.util.Scanner;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Talking?");
        boolean talk = in.nextBoolean();
        System.out.println("Hour: ");
        int hr = in.nextInt();

        ParrotTrouble obj = new ParrotTrouble();
        System.out.println(obj.parrotTrouble(talk, hr));
    }
}
