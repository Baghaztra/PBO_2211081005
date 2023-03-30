/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz300323;

/**
 *
 * @author Bagas
 */
public class AritmatikaExample {
    public static void main(String[] args){
        Aritmatika ar = new Aritmatika();
        
        int a =1;
        int b =2;
        System.out.println("Hasil penjumlahan : "+ar.tambah(a,b));
        System.out.println("Apakah a ganjil? "+ar.cekganjil(a));
        
        System.out.println("5 ganjil pertama: ");
        int[] ganjil = ar.nGanjilPertama(5);
        for(int i =0; i<ganjil.length;i++){
            System.out.print(ganjil[i]+", ");
        }
        System.out.println();
        
        System.out.println("5 prima pertama: ");
        int[] prima = ar.nPrimaPertama(5);
        for(int i =0; i<prima.length;i++){
            System.out.print(prima[i]+", ");
        }
        System.out.println();
    }
}
