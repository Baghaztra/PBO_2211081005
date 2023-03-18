/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz180323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bagas
 */
public class Latihan721 {
    //Module 7, nomor 2, menggunakan bufferedreader
    public static void main(String[] args){
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in)); 
        try{
            int nu[] = new int[10];
            int max=0;
            System.out.println("Masukkan 10 angka: ");
            for(int i =0;i<10;i++){
                nu[i] = Integer.parseInt(in.readLine());
                if(nu[i]>max){
                    max = nu[i];
                }
            }
            System.out.println("Nilai terbesar: "+max);
        }catch(IOException e){
            System.out.println("Error!");
        }
    }
}
