package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ario
 */
import test.Test;
public abstract class ParentClass2{
    public int id;
    
    
    //antara setId() dan setId(int id) adalah overloading
    public void setId(){
        id = 10;
    }
    
    public ParentClass2(int id){
        
    }
    
//    public ParentClass(){
//        
//    }
    
    public void setId(int id){
        //overriden by child class
        System.out.println("This is the parent class");
    }
    
    public abstract void testAbstract();
}
