package ex2002024;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the browser");
       String browser=sc.next();

       switch (browser)
       {
           case "chrome":
               System.out.println("Chrome");
               break;
           case "firefox":
               System.out.println("firfox");
               break;

       }

    }
}
