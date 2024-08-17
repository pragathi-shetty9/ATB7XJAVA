package ex11082024interface;

import java.net.InterfaceAddress;

public interface Example {

    interface i{}
    interface i1{}
    class A{}
    class B{}
    abstract class y{}
    class a extends A{}
    //class b extends A,B{}
    class c implements i{}
    class d implements i,i1{}
    class e extends A implements i,i1{}
   // class f implements i extends A{}
   // interface f extends A{}//A is class
    interface f extends i{}
    //interface g implements i{} interface cannot imlmets interface


}
