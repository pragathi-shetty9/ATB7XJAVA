package ex21072024;

import jdk.dynalink.beans.StaticClass;

import javax.xml.namespace.QName;

public class Lab036 {
    public static void main(String[] args) {
        //functions

fnctiontype_01();
String result=functontype_02();
System.out.println(result);
functiontype_03("Amit");
int sum=functiontye_04(5,7);
System.out.println(sum);





    }
    //without retun withpt para
    static void fnctiontype_01(){
        System.out.println("Hi");

    }

    //without para with return
    static String functontype_02(){
        return "Pragathi";

    }

    //with para without return
    static void functiontype_03(String name)
    {
        System.out.println("your name is" +name);
    }

    //with para with return
    static int functiontye_04(int a,int b){
        return a+b;
    }
}
