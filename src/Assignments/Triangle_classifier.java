package Assignments;

import java.util.Scanner;

public class Triangle_classifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first side of triangle");
        float side_1= sc.nextFloat();

        System.out.println("enter the first side of triangle");
        float side_2= sc.nextFloat();

        System.out.println("enter the first side of triangle");
        float side_3= sc.nextFloat();

        if(side_1==side_2 && side_2==side_3){
            System.out.println("triangle is a equilateral triangle");
        } else if (side_1==side_2||side_2==side_3||side_1==side_3) {
            System.out.println("triangle is a isosceles triangle");
        }
        else
            System.out.println("triangle is a scalene triangle");


    }
}
