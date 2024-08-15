package ex27072024;

import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sub[]=new int[6];

        for (int i = 0; i <sub.length; i++) {

            System.out.println("Enter marks"+(i+1));
            sub[i]=sc.nextInt();


        }
        //to print
        for (int i = 0; i <sub.length ; i++) {
            System.out.println("marks of"+(i+1)+"is  "+sub[i]);

        }
        float avg=sub[0]+sub[1]+sub[2]+sub[3]+sub[4]+sub[5]/5;
        System.out.println("avg is"+avg);

    }
}
