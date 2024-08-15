package ex04082024;

public class BankAct {
    String name;
    int balance;
    String address;

    BankAct(){
        name="SBI";
        balance=150;
        address="bng";
    }

    BankAct(String bnkname,int blnc, String address){
        this.name=bnkname;
        this.balance=blnc;
        this.address=address;
    }

    public static void main(String[] args) {
        BankAct b1=new BankAct();
        System.out.println(b1.balance);
        System.out.println(b1.address);
        System.out.println(b1.name);

        BankAct b2=new BankAct("ICICI",1400,"MUMBAI");
        System.out.println(b2.balance);
        System.out.println(b2.address);
        System.out.println(b2.name);

        //DC-is to initialize the values before
        //PC-we can even ask inputs from user



    }
}
