package ex10_082024.encap;

public class ICICIBank {

    private String Balance;
    private String username;

    public String getBalance() {
        return Balance;
    }

    public String getUsername() {
        return username;
    }

    public void setBalance(String balance,Boolean isAdmin) {
        if (isAdmin) {
            this.Balance = balance;

        }
        else {
            System.out.println("not allowed");
        }

    }

    public void setUsername(String username,Boolean isAdmin) {
        if (isAdmin){
            this.username = username;
        }
        else {
            System.out.println("Not allowed!!");
        }

    }

    public ICICIBank(String balance, String username){
        this.Balance=balance;
        this.username=username;

    }

    public static void main(String[] args) {
        ICICIBank bank=new ICICIBank("80000","Admin");

        System.out.println(bank.getBalance());
        bank.setUsername("Pragathi",true);
        System.out.println(bank.getUsername());
        bank.setBalance("78000",true);

        ICICIBank Pragathi=new ICICIBank("67000","Shetty");
        System.out.println(Pragathi.getUsername());
        System.out.println(Pragathi.getBalance());
        Pragathi.setBalance("90000",false);
        Pragathi.setUsername("Pragathi",false);

    }

}
