package ex21072024;

public class Lab032 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                continue;
            }
            else
                System.out.println("after");
        }

    }
}
