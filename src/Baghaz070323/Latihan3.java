/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baghaz070323;

/**
 *
 * @author LABSIKOMP03
 */
public class Latihan3 {
    //Menampilkan nilai terbesar
    public static void main(String[] args){
        //deklarasi variabel
        int a = 10;
        int b = 23;
        int c = 5;
        
        int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
        
        //cetak variabel
        System.out.println("Number1 = "+ a);
        System.out.println("Number2 = "+ b);
        System.out.println("Number3 = "+ c);
        System.out.println("NIlai tertingginya adalah angka = "+max);
    }
}