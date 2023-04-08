/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz080423;

/**
 *
 * @author Bagas
 */
public class Student extends Person{
    public Student(){
        super( "Ali", "Padang" );
        System.out.println("Inside Student:Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    } 

    public static void main( String[] args ){
        Student student = new Student();
        System.out.println("Nama  : "+student.name);
        System.out.println("Alamat: "+student.address);
    } 
} 