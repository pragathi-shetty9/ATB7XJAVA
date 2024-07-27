package ex2002024;

import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Scanner;

public class Lab021 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int day= sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("No idea");



        }

        System.out.println("out of switch");

    }
}
