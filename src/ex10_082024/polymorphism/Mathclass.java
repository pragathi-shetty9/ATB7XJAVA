package ex10_082024.polymorphism;

//Method Overloading

public class Mathclass {

    int add(int a,int b){
        return a+b;

    }

    double add(double a,double b){
        return a+b;
    }

    String add(String a,String b){
        return a+b;
    }

    String add(String b,int a){
        return a+b;
    }

    String add(int a,String b){//order of arg changed
        return a+b;
    }

    public static void main(String[] args) {
        Mathclass math=new Mathclass();
        int reslt=math.add(3,7);
        System.out.println(reslt);
        double reslt1=math.add(4.9,9.8);
        System.out.println(reslt1);

    }
}
