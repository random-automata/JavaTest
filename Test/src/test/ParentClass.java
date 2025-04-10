package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ario
 */

//adding comment for testing git command
import test.Test;
public abstract class ParentClass implements Class1{
    public int id;
    
    
    //antara setId() dan setId(int id) adalah overloading
    public void setId(){
        id = 10;
    }
    
    public ParentClass(int id){
        
    }
    
//    public ParentClass(){
//        
//    }
    
    public void setId(int id){
        //overriden by child class
        System.out.println("This is the parent class");
    }
    
    public abstract int testAbstract();
}
