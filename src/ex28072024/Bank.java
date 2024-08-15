package ex28072024;

public class Bank {
    String name;
    String balance;

    void withdraw(){}
    void deposit(){}

    public static void main(String[] args) {
        Bank b1=new Bank();
        Bank b2=new Bank();

        b1.name="SBI";
        b1.balance="10000";

        System.out.println(b1.name);


    }

}

