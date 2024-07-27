package ex2002024;

import java.util.Scanner;

public class Lab017 {
    //even odd
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();

        if(a%2==0){
            System.out.println("a is even"+a);
        }
        else
            System.out.println("a is odd"+a);


    }
}
