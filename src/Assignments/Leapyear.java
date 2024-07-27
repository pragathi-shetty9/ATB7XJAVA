package Assignments;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        //leap year
        //year must be divisible by 400
        //year must be divisible by 4 not 100
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int year= sc.nextInt();

        if((year%4==0) && (year%100!=0) || (year%400==0))
        {
            System.out.println("year" +year+ "is leap year" );
        }
        else
            System.out.println("year" +year+ "is not a leap year" );
    }
}
