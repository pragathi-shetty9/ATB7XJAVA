package ex04082024.inheritence.multilevelinheritence;

public class Son extends Father{
    void home(){
        GF();//can also call function inside function
        System.out.println("3BHK");} //if same functions are there priority C-F-GF

    public static void main(String[] args) {
        new Son().home();
        new Father().f(); //No need of object creation if we are using inheritence concept



        }
    }

