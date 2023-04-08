/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz080423;

/**
 *
 * @author Bagas
 */
public class Square extends Shape{
    private int sisi;
    public Square(int sisi){
        this.sisi = sisi;
    }
    public double getArea(){
        return sisi * sisi;
    }
    public String getName(){
        return "Persegi";
    }
    
}
