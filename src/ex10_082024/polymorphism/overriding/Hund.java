package ex10_082024.polymorphism.overriding;

public class Hund extends Dog {
    @Override
    void bark(){
        System.out.println("Hey I am a hound");
    }

    public static void main(String[] args) {
        Hund H1=new Hund();
        H1.bark();

        Dog dog1=new Hund();
        dog1.bark();
    }
}
