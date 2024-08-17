package ex11082024interface;

public class WagonR implements Engine{
    @Override
    public void start() {
        System.out.println("start the car");
    }

    @Override
    public void stop() {

        System.out.println("stop the car");
    }

    public static void main(String[] args) {
        WagonR w=new WagonR();
        w.start();
    }
}
