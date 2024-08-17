package ex11082024interface.Ex3;

public interface Engine {

    void m1();
    void m2();

    default void m3(){
        System.out.println("Engine start");
    }

    static void m4(){
        System.out.println("Engine stop");
    }


}
