package ex27072024;

import java.util.Scanner;

public class Lab040 {
    public static void main(String[] args) {
        //findng the avg of the subjects

        float marks[]=new float[6];

        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of sub1");
        marks[0]= sc.nextFloat();
        System.out.println("enter marks of sub2");
        marks[1]=sc.nextFloat();
        System.out.println("enter marks of sub3");
        marks[2]=sc.nextFloat();
        System.out.println("enter marks of sub4");
        marks[3]=sc.nextFloat();
        System.out.println("enter marks of sub5");
        marks[4]=sc.nextFloat();
        System.out.println("enter marks of sub6");
        marks[5]=sc.nextFloat();

        float avg=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5])/6;
        System.out.println("Avg of all sub is"+avg);

    }
}
