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
public class Latihan611 {
    //Latihan module 6 (6.5.1Nilai) dengan bufferedreader
    public static void main(String[] args){
        BufferedReader in =
        new BufferedReader (new InputStreamReader(System.in)); 
        int n1=0,n2=0,n3=0;
        float rata;
        //Bufferedreader
        try{
            System.out.print("Masukkan nilai 1: ");
            n1 = Integer.parseInt(in.readLine());
            System.out.print("Masukkan nilai 2: ");
            n2 = Integer.parseInt(in.readLine());
            System.out.print("Masukkan nilai 3: ");
            n3 = Integer.parseInt(in.readLine());
        }catch(IOException e){
            System.out.println("Error!");
        }
            
        rata = (n1+n2+n3)/3;
        System.out.print("Nilai rata-rata: "+ rata);
        if(rata>=60)
            System.out.println(" :)");
        else
            System.out.println(" :-(");

    }
}
