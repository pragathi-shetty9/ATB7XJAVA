package ex10_082024;

public class Realtimeinheritence {
    public static void main(String[] args) {
        BaseClass t = new Testcase1();//dynamic dispatch
        t.setBrowser("Opera",true);

    }
}


    class BaseClass{
        private String browser;//encapsulation

        BaseClass(){
            System.out.println("DC");
        }

        public String getBrowser() {//encapsulation
            return browser;
        }

        public void setBrowser(String browser,Boolean isAuth) {
            this.browser = browser;
        }

        void StartBrowser(){
            System.out.println("start the browser!!");
        }

        void StartBrowser(String Browser){//overloading
            System.out.println("start the browser!!"+browser);
        }



        void CloseBrowser(){
            System.out.println("close the browser!!");
        }
    }

    class Testcase1 extends BaseClass {

    Testcase1(){//constructor
        super();
        this.setBrowser("edge",true);
    }

        @Override
        public void setBrowser(String browser, Boolean isAuth) {
            super.setBrowser(browser, isAuth);



        }
    }

