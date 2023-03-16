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
public class Latihan2 {
    //Mendapatkan nilai rata-rata dari 3 angka
    public static void main(String[] args){
        int number1;
        int number2;
        int number3;
        int average;
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan Nilai 1 : ");
            number1 = Integer.parseInt(in.readLine());
            System.out.print("Masukkan Nilai 2 : ");
            number2 = Integer.parseInt(in.readLine());
            System.out.print("Masukkan Nilai 3 : ");
            number3 = Integer.parseInt(in.readLine());
            
            average = (number1 + number2 + number3)/3;
            System.out.println("Nilai Rata-Rata : "+average);
        }catch(IOException e){
            System.out.println("Error!");
        }
    }
}
