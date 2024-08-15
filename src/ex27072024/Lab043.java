package ex27072024;

public class Lab043 {
    public static void main(String[] args) {
        //min of salary using array
        float salary[]={8,15,6,18,9};
        float min=salary[0];
        for (int i = 0; i <salary.length ; i++) {
            if (salary[i]<min){
                min=salary[i];
            }

        }
        System.out.println("maximum salary is"+min);
    }
}
