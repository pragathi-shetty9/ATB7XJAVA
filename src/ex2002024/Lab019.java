package ex2002024;

import java.util.Scanner;

public class Lab019 {
    public static void main(String[] args) {
        //grade calc
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int marks=sc.nextInt();
        char grade='F';
        if(marks<=100 && marks>=90)
          //  System.out.println("your grade is A");
            grade='A';
        else if (marks<=89 && marks>=80)
            System.out.println("your grade is B");
        else if (marks<=79 && marks>=69) {
            System.out.println("your grade is C");
                sc.close();

        }
        System.out.println("your grade is_>"+grade);


    }
}
