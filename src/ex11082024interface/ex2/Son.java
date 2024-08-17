package ex11082024interface.ex2;

public class Son implements Father,Mother {

    @Override
    public void Loan() {
        System.out.println("coming from both mother and father");

    }

    @Override
    public void money(String a, String b) {

    }

    @Override
    public void money(String a) {

    }

    public static void main(String[] args) {
        Son s=new Son();
        s.Loan();
    }
}
