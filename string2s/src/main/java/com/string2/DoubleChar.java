package com.string2;
public class DoubleChar {
    public String doubleChar(String str) {
        String ans="";
        for (int i=0; i<str.length(); i++)
        {
            String charac= str.substring(i, i+1);
            ans += charac + charac;
        }
        return ans;
    }

    public static void main(String[] args) {
        DoubleChar obj=new DoubleChar();
        System.out.println(obj.doubleChar("The") );
    }

}
