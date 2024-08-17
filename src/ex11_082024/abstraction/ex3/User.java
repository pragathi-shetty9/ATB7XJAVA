package ex11_082024.abstraction.ex3;

public class User {
    public static void main(String[] args) {
        Chrome c=new Chrome();
        c.OpenBrowser();
        c.Screenshot();
        c.CloseBroser();

        Firefox f=new Firefox();
        c.OpenBrowser();
        c.Screenshot();
        c.CloseBroser();

    }
}
