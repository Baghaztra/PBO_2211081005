/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baghaz160323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bagas
 */
public class Latihan3 {
    //Menampilkan nilai terbesar
    public static void main(String[] args){
        int a,b,c,max;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Masukkan Nilai Pertama : ");
            a = Integer.parseInt(in.readLine());
            System.out.print("Masukkan Nilai Pertama : ");
            b = Integer.parseInt(in.readLine());
            System.out.print("Masukkan Nilai Pertama : ");
            c = Integer.parseInt(in.readLine());
            
            max = (a>b)?((a>c)?a:c):((b>c)?b:c);
            
            System.out.println("Nilai Max : "+max);
        }catch(IOException e){
            System.out.println("Error!");
        }
    }
}