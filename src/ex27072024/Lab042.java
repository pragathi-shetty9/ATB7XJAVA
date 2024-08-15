package ex27072024;

public class Lab042 {
    public static void main(String[] args) {
        //max of salary using array
       float salary[]={6,8,15,18,9};
       float max=salary[0];
        for (int i = 0; i <salary.length ; i++) {
            if(salary[i]>max)
            {
                max = salary[i];
            }
            //System.out.println(max);

        }
        System.out.println("maximum salary is"+max);
    }
}
