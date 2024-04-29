/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageCasting;

/**
 *
 * @author ario
 */
public class Driver {
    public static void main(String[] args){
       Parent p = new Parent();
       ChildA cA = new ChildA();
//       Parent castP;
//        System.out.println("test");
//        cA = (ChildA) p;
//        p = cA;
        

       System.out.println(cA.methodA());
//       p = cA;
       System.out.println(p.methodA());
       
//        if(cA instanceof ChildA){
            System.out.println("this is instance of ChildA, boolean: " + (p instanceof ChildA));
//        }
       
    }
}
