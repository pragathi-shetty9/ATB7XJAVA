package ex11_082024.abstraction;

abstract public class Car extends engine {
    //car has engine gearbox,keys

    @Override
    void lock() {
        System.out.println("lock  car");

    }

    @Override
    void open() {
        System.out.println("open car");
    }

    @Override
    void partgearbox() {
        System.out.println("part of gearbox");
    }

    @Override
    void stop() {
        System.out.println("stop car");
    }

    @Override
    void start() {
        System.out.println("start car");
    }

    //Tesla is a car where we know only can drive


}
