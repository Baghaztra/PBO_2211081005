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
public class Latihan622 {
    //Latihan module 6 (6.5.2Membaca Bilangan) dengan case
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
        
        switch(n){
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            case 4:
                System.out.println("Empat");
                break;
            case 5:
                System.out.println("Lima");
                break;
            case 6:
                System.out.println("Enam");
                break;
            case 7:
                System.out.println("Tujuh");
                break;
            case 8:
                System.out.println("Delapan");
                break;
            case 9:
                System.out.println("Sembilan");
                break;
            case 10:
                System.out.println("Sepuluh");
            default:
                System.out.println("Invalid number");
        }
    }
}
