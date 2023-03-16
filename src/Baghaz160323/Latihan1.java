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
public class Latihan1 {
    //Mendeklarasi dan mencetak variabel
    public static void main(String[] args){
        //deklarasi variabel
        int number = 0;
        char letter = ' ';
        boolean result = false;
        String str = "";
        BufferedReader in =
        new BufferedReader (new InputStreamReader(System.in)); 
        
        //input variabel
        try{
            System.out.print("Number = ");
            number = Integer.parseInt(in.readLine());
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        try{
            System.out.print("letter = ");
            letter = (char) in.read();
            in.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        try{
            System.out.print("result = ");
            result = Boolean.parseBoolean(in.readLine());    
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        try{
            System.out.print("str = ");
            str = in.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        //cetak variabel
        System.out.println();
        System.out.println("Number = "+number);
        System.out.println("letter = "+letter);
        System.out.println("result = "+result);
        System.out.println("str = "+str);
    }
}