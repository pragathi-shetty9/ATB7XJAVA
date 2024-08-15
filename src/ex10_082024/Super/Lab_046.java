package ex10_082024.Super;

//Super

import ex04082024.Car;

public class Lab_046 {
    public static void main(String[] args) {
        car c = new car();
        c.display();
        //polymorphism override
        Vehicle v=new car();
        c.message();
        v.message();//object one function will display

    }
}
    class Vehicle{
        public String maxspeed="180";

        Vehicle(int a){
            System.out.println("hey");
        }

        public void message(){
            System.out.println("****");

        }

    }

    class car extends Vehicle{
        public String maxspeed="189";

        car(){
            super(10);
            System.out.println("Hello");


        }
        @Override
        public void message(){
            System.out.println("***");
        }



        public void display(){
            System.out.println("MY car speed is"+this.maxspeed);
            System.out.println("My vehicle speed is"+super.maxspeed);
        }

    }





