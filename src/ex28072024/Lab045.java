package ex28072024;

import java.util.Locale;

public class Lab045 {
    public static void main(String[] args) {
        //OOPS-concept
        //Real life problem-OOPS
        //if we want to create new planet as AHUMAN
        //behaviour:walk(),eat(),talk()etc
        //attributes-height,weight,eyes
        Person P=new Person();
        P.name="Amit";
        P.rollNo="SU145";

        Person p=new Person();
        p.name="Pritvi";

        //Builder
        Builder B=new Builder();
        B.name="Prestige";
        B.address="Bangalore";
        B.room_no=20;
        B.activity();
        B.uselift();

    }
}
