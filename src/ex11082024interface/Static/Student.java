package ex11082024interface.Static;

public class Student {
    public static void main(String[] args) {
        ATB a = new ATB("Pragathi");
        //ATB-executes static class when class loader called

        System.out.println(a.getName());
        String b = ATB.coursename;
        System.out.println(b);
        ATB.DoAssignment();
    }
}

    class ATB{
        {
            System.out.println("IIB"); //instant initialization block
                                        //when we create object this block will be called
                                        //to write anything before starting code
        }



        private String name;
        static String coursename="JAVA";


        public String getName() {
            return name;
        }

        public ATB(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;


        }

        static void DoAssignment(){
            System.out.println("do it");
        }

        static {
            System.out.println("Class loaded");
            //execute when we load class
        }
    }

