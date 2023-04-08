/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz080423;

/**
 *
 * @author Bagas
 */
public class Person {
    protected String name; //agar biasa diakses oleh subclass
    protected String address;

    //Default constructor
    public Person(){
        System.out.println("Inside Person :Constructor");
        name = "";
        address = "";
     }
    public Person( String name, String address ){
        this.name = name;
        this.address = address;
     }
 
    //accessor
    public String getName(){
        System.out.println("Parent: getName"); 
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setName( String name ){
        this.name = name;
    }
    public void setAddress( String add ){
        this.address = add;
    }
}