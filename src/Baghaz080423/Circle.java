/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz080423;

/**
 *
 * @author Bagas
 */
public class Circle extends Shape{
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public double getArea(){
        return 3.14 * radius*radius;
    }
    public String getName(){
        return "Lingkaran";
    }
}
