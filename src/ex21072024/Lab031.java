package ex21072024;

public class Lab031 {
    public static void main(String[] args) {
        //printimg 1-50 even numbers
        //for (int i = 50; i > 0; i--) -ulta/reverse
        for (int i = 0; i < 50; i++) {
            if(i%2==0) {
                System.out.println("even->"+i);
            }
            else {
                System.out.println("odd->>"+i);
            }
        }
    }
}
