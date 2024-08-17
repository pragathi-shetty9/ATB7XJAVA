package ex11_082024.abstraction.ex2;

public class Son extends Father{

    @Override
    void loan50k() {
        System.out.println("he will");

    }

    public static void main(String[] args) {
        Son s1=new Son();
        s1.loan50k();
    }
}
