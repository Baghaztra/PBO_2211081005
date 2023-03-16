/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz160323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bagas
 */
public class Latihan621 {
    //Latihan module 6 (6.5.2Membaca Bilangan) dengan if-else
    public static void main(String[] args){
        BufferedReader in =
        new BufferedReader (new InputStreamReader(System.in)); 
        int n =0;
        
        //proses
        System.out.print("Masukkan angka 1-10 : ");
        try{
            n = Integer.parseInt(in.readLine());
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        if(n ==1 )
            System.out.println("Satu");
        else if(n ==2)
            System.out.println("Dua");
        else if(n ==3)
            System.out.println("Tiga");
        else if(n ==4)
            System.out.println("Empat");
        else if(n ==5)
            System.out.println("Lima");
        else if(n ==6)
            System.out.println("Enam");
        else if(n ==7)
            System.out.println("Tujuh");
        else if(n ==8)
            System.out.println("Delapan");
        else if(n ==9)
            System.out.println("Sembilan");
        else if(n ==10)
            System.out.println("Sepuluh");
        else
            System.out.println("Invalid number");
            
    }
}
