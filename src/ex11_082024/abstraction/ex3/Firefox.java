package ex11_082024.abstraction.ex3;

public class Firefox extends BaseClass{
    @Override
    String OpenBrowser() {
        System.out.println("Open Browser");
        return "";
    }

    @Override
    String CloseBroser() {
        System.out.println("Close Browser");
        return "";
    }
}
