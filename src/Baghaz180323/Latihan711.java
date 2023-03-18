/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz180323;

/**
 *
 * @author Bagas
 */
public class Latihan711 {
    //Module 7, nomor1, menggunakan for loop
    public static void main(String[] args){
        String hari[] = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
        System.out.print("Hari dalm seminggu: ");
        for(int i =0;i<hari.length;i++){
            System.out.print(hari[i]);
            if(i<hari.length -1)
                System.out.print(", ");            
        }
        System.out.println();
    }
}
