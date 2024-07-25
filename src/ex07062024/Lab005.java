package ex07062024;

import java.util.Scanner;

public class Lab005 {
    //FizzBuzz program
    // multileof 3 fizz multileof 5 buzz both fizzbuzz
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //taking input from keyboard
        System.out.println("Enter Number");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i%3 == 0 && i%5 == 0)
                System.out.println("FizzBuzz");
            else if (i%3== 0)
                System.out.println("Fizz");
            else if (i%5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
        sc.close();
    }


}




