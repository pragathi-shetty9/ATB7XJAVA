package ex04082024.inheritence;

public class son extends Father {
    void bhk3(){
        System.out.println("3 bhk");
    }

    public static void main(String[] args) {
        son s=new son();
        s.bhk3();
        s.bhk2();
    }

    }

