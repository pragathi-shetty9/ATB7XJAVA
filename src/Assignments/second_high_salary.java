package Assignments;

public class second_high_salary {
    public static void main(String[] args) {
        //to find secnd highst salary
        float salary[] = {6, 8, 15, 18, 9};

        float second_max = 0;
        for (int i = 0; i < salary.length; i++) {
            for (int j = i + 1; j < salary.length; j++) {
                if (salary[i] > salary[j]) {
                    second_max = salary[j];

                }
                System.out.println(second_max);

            }
        }
    }
}