package ex04082024;

public class A2BPerson {
    //constructor

    String name;
    Long PhoneNo;
    //DC-default constructor

    A2BPerson(){
        System.out.println("hey");
        //if we didnt set value string=null int,null=0
    }

    A2BPerson(String namegiven,Long Phone){
        this.name=namegiven;
        this.PhoneNo=Phone;
        //this-current class

    }

    public static void main(String[] args) {
        A2BPerson p1=new A2BPerson("Pragathi", 876589444L);
        A2BPerson p2=new A2BPerson("Pooja",84484852942L);

        System.out.println(p1.name);
        System.out.println(p2.PhoneNo);

    }

}
