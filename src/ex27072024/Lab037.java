package ex27072024;

import java.util.Scanner;

public class Lab037 {
    public static void main(String[] args) {
        //arrays
        //initialiation

        int[] marks={110,67,89,88};//1
        String shop_list[]={"milk","cake"};//2
        int student_id[]={30,87,99};

        //using new
        int mark[]=new int[3];
        mark[0]=90;
        Scanner sc=new Scanner(System.in);
        mark[1]=sc.nextInt();
        mark[2]=100;

        //boolean array
        boolean married[]={true,false,true};

        //traverseing array
        for (int i = 0; i <mark.length ; i++) {
            System.out.println(mark[i]);

        }


    }
}
