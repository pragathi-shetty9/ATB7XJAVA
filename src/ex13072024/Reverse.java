package ex13072024;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        //Reverse
      //  String word="Hello";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String word=sc.next();
        String revesed="";

        //Hello
        //olleH

        for (int i=0;i<word.length();i++)
        {
            revesed=word.charAt(i)+revesed;
        }

System.out.print("reversed string is "+revesed);
    }
}
