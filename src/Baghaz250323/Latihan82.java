/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz250323;

/**
 *
 * @author Bagas
 */
public class Latihan82 {
    //Operasi aritmatik
    public static void main(String[] args){
        //Saya menjalankan di cmd dengan:
        //java Latihan82.java 20 4
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a+b;
        int dif = Math.abs(a-b);
        int pro = a * b;
        int quo = a / b;
        System.out.println("Sum        = "+sum);
        System.out.println("Difference = "+dif);
        System.out.println("Product    = "+pro);
        System.out.println("Quotient   = "+quo);
    }
}
