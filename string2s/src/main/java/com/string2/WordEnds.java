package com.string2;
import java.util.Scanner;

public class WordEnds {
    public String wordEnds(String str, String word) {
        String result="";
        int len=word.length();
        int i=1;
        if (str.indexOf(word) == 0 && len != str.length())
            result =str.substring(len,len +1);
        while (str.indexOf(word,i) !=-1 &&
                i<str.length()-len)
        {
            if (str.substring(i,i+len).equals(word))
            {
                result += str.substring(i-1,i) +str.substring(i+len,i+len+1);
                i +=len-1;
            }
            i++;
        }
        if (str.lastIndexOf(word) == str.length()-len && len != str.length())
            result += str.substring(str.length()-len-1,str.length()-len);
        return result;
    }
    /*make a new string result
    go through str the length()-lengthof word
    if the 2 numbers are equal to the given word
        add a letter before the word from str o result
        skip the lengthofword
    return result*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String word1 = in.nextLine();
        String word2 = in.nextLine();

        WordEnds obj = new WordEnds();
        System.out.println(obj.wordEnds(word1,word2));
    }
    
}
