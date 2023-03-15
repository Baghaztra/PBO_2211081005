/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz080323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bagas
 */
public class Latihan1 {
    public static void main(String[] args){
        BufferedReader dataIn =
        new BufferedReader (new InputStreamReader(System.in)); 
        
        String word1 = "",word2= "" ,word3= "";
        
        System.out.print("Enter word1: ");
        try{
            word1 = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        System.out.print("Enter word2: ");
        try{
            word2 = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        System.out.print("Enter word3: ");
        try{
            word3 = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        System.out.println(word1+" "+word2+" "+word3);
    }
}
