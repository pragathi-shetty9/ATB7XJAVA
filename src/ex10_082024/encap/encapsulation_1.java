package ex10_082024.encap;

public class encapsulation_1 {
    public static void main(String[] args) {
        encap encapsulation=new encap("admin","admin");
       System.out.println(encapsulation.getPwd());
       encapsulation.setUsername("Pragathi");;
       System.out.println(encapsulation.getUsername());
       encapsulation.setPwd("34555",true);
       System.out.println(encapsulation.getPwd());


    }







}
class encap {
    private String username;
    private String pwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String Password, Boolean isAuth) {
        if (isAuth) {
            this.pwd = Password;
        } else {
            System.out.println("can't set pwd");
        }
    }



        encap(String pwd, String username) {
            this.pwd = pwd;
            this.username = username;


        }
    }




