package com.string2;
import java.util.Scanner;

public class xyBalance {
    public boolean xyBalance(String str) {
        if (str.indexOf("y",str.length()-1)==str.length()-1)
            return true;
        boolean result=true;
        int indX;
        int indY;
        for (int i=0; i<str.length(); i++)
        {
            indX=str.indexOf("x",i-1);
            indY=str.indexOf("y",i);
            if (indX>indY)
                result=false;
        }
        return result;
    }
          /*int indX=str.indexOf("x");
      if ((str.indexOf("x")==-1 && (str.indexOf("y"))==-1))
        return true;
      else if (!(str.indexOf("x")<str.indexOf("y",indX)))
        return false;
      return true; */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        xyBalance obj= new xyBalance();
        System.out.println(obj.xyBalance(word));
    }
}
