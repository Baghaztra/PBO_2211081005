/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz180323;

/**
 *
 * @author Bagas
 */
public class Latihan73 {
    public static void main(String[] args){
        String data[][] = {{"Florence", "735-1234", "Manila"},
                           {"Joyce", "983-3333", "Quezon City"},
                           {"Becca", "456-3322", "Manila"}}; 
        for(int i = 0;i<3;i++){
            System.out.println("Nama   : "+data[i][0]);
            System.out.println("Tel. # : "+data[i][1]);
            System.out.println("Address: "+data[i][2]);
            System.out.println();
        }
    }
}
