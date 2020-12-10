package com.string2;
import java.util.Scanner;

public class PlusOut {
    public String plusOut(String str, String word) {

        String result="";
        int i=0;
        int j=word.length();
        while (i<str.length())
        {
            if (i<=str.length()-j && str.substring(i,i+j).equals(word))
            {
                result += word;
                i += j;
            }
            else
            {
                result += "+";
                i++;
            }
        }
        return result;
    }
    /*make a new string -'result'
    a new string j -store length of "word"
    go through str
    if the exctracted word is is equal to 'word'
     add the word to string
    skip the length of 'word'
    else 
    add '+' to result
    skip that letter
    return result*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1 = in.nextLine();
        String word2 = in.nextLine();

        PlusOut obj = new PlusOut();
        System.out.println(obj.plusOut(word1,word2));
    }
}
