package ex2002024;

import java.util.Scanner;

public class Lab018 {
    public static void main(String[] args) {
        //max of 3 numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number1");
        int a=sc.nextInt();

        System.out.println("enter number2");
        int b=sc.nextInt();


        System.out.println("enter number3");
        int c=sc.nextInt();

        if(a>=b || a>=c)
            System.out.println("A is greater");
        else if (b>=c)
            System.out.println("B is greater");
        else
            System.out.println("C is greater");



    }
}
