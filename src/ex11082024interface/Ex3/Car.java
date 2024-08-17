package ex11082024interface.Ex3;

public class Car implements Engine{
    //method which is completed with dfalt and static are not appard
    @Override
    public void m1() {
        System.out.println("Engine start");
    }

    @Override
    public void m2() {
        System.out.println("Engine start");

    }

    public static void main(String[] args) {
        Car c=new Car();
        c.m3();
    }
}
