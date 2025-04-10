/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author ario
 */
public abstract class Test extends ParentClass implements Class1, Class2{
    public int id;
    protected String nama;
    private boolean status;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ParentClass obj = new ParentClass(300);
//        ParentClass obj2 = new ParentClass();
//        obj2.setId(123);
        
//        Test objChild = new Test();
//        objChild.setId(30);
//        
//        ParentClass obj = (ParentClass) objChild;
        
        //variable, object, itu bisa di assign/replace oleh object/variable lainnya
        
    }
    
    public Test(){
        super(30);
    }
    
    public void setId(int id){
        System.out.println("This is the child class");
    }

    @Override
    public int testAbstract() {
        return 0;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void TEST(){
        
    }

    public void printDataMahasiswa(){
        
    }
    
    
    
}
