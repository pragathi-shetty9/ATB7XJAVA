package ex2002024;

import java.util.Scanner;

public class Lab023 {
    public static void main(String[] args) {
        //switch can return the value -yeild
        //checking if the char is vowel or not
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");

            case 'o','u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");

        }

    }
}
