/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz080423;

/**
 *
 * @author Bagas
 */
public class PolimorfisExample {
    public static void main(String[] args){
        Person ref; //sifat ref berubah sesuai acuannya
        Student student = new Student();
        Employee emp = new Employee();
        student.setName("Budi");
        student.setAddress("Padang");
        
        emp.setName("Doni");
        emp.setAddress("Bukittinggi");
        
        //subclass bisa dijadikan parameter dari superclass
        printInformation(student);
        printInformation(emp);
        
        /*
        ref = student;
        String tmp = ref.getName();
        System.out.println(tmp);
        
        ref = emp;
        String tmp1 = ref.getName();
        System.out.println(tmp1);
        */
    }
    public static void printInformation(Person p){
        if(p instanceof Student){
            System.out.println("Nama Student   :"+p.getName());
            System.out.println("Adress Student :"+p.getAddress());
        }
        if(p instanceof Employee){
            System.out.println("Nama   Employee:"+p.getName());
            System.out.println("Adress Emplyee :"+p.getAddress());
        }
    }
}