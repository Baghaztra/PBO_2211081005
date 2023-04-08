/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz080423;

/**
 *
 * @author Bagas
 */
public abstract class Shape {
    //latihan 2 dari module 11
    public abstract double getArea();
    public abstract String getName();
    
    public static void main(String[] args){
        Circle a = new Circle(10);
        Square b = new Square(5);
        
        System.out.println("Nama objek a: "+a.getName());
        System.out.println("Luas objek a: "+a.getArea());
        System.out.println();
        System.out.println("Nama objek b: "+b.getName());
        System.out.println("Luas objek b: "+b.getArea());
    }
}
