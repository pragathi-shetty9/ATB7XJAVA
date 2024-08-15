package ex10_082024.Super;

public class Lab_047 {

    class Person{

        Person(){
            System.out.println("default constructor");
        }
        Person(String a){
            System.out.println("constructor with one arg");
        }

        Person(String a,int b){
            System.out.println("constructor with 2 arg");
        }
    }

    class Student extends Person{
        Student(){
            //super();//for default
            //super("Pragathi");
            super("p",6);//only once super constuctor can b called



        }
    }
}
