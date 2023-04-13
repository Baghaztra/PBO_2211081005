/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz130423;

/**
 *
 * @author Bagas
 */
public class Lingkaran {
    private int r;
    public Lingkaran(int r){
        this.r=r;
    }
    public double Luas(){
        return 3.14*r*r;
    }
    
    public static void main(String[] args){
        Lingkaran a = new Lingkaran(7);
        Lingkaran b = new Lingkaran(8);
        MyDouble banding = new MyDouble();
        
        System.out.println("a > b : "+banding.isGreater(a.Luas(),b.Luas()));
        System.out.println("a < b : "+banding.isLess(a.Luas(),b.Luas()));
        System.out.println("a = b : "+banding.isEqual(a.Luas(),b.Luas()));
    }
}
